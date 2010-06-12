package com.tangledcode.lang8.server.service;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.AuthenticationResponse;
import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.exception.UserAuthenticationException;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.service.UserService;
import com.tangledcode.lang8.server.util.HibernateUtil;
import com.tangledcode.utils.DigestUtils;
import com.tangledcode.utils.DigestUtils.Algorithm;

public class UserServiceImp extends RemoteServiceServlet implements UserService {

    private static final long serialVersionUID = 7680230463891208130L;
    private static final String SALT = "Some random goofy text that no one can guess";
    
    private String sessionId = null;

    public AuthenticationResponse authenticate(String username, String password) throws UserAuthenticationException {
        String digestedPassword = DigestUtils.digest(password, DigestUtils.Algorithm.SHA256);
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = (User) session
                .createCriteria(User.class, "u")
                .add(Restrictions.eq("u.username", username))
                .add(Restrictions.eq("u.password", digestedPassword))
                .uniqueResult();
        
        session.getTransaction().commit();

        if(user == null) {
            throw new UserAuthenticationException();
        }
        
        this.sessionId = DigestUtils.digest(System.currentTimeMillis() + SALT, DigestUtils.Algorithm.SHA256);

        return new AuthenticationResponse(user, this.sessionId);
    }

    public UserDTO getUser(long id, String sessionId) throws UserAuthenticationException {
        if(this.sessionId == null || !this.sessionId.equals(sessionId)) {
            throw new UserAuthenticationException();
        }
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = (User) session.get(User.class, id);
        
        session.getTransaction().commit();

        return new UserDTO(user);
    }

    public long saveUser(UserDTO userDTO, String sessionId) throws UserAuthenticationException {
        if(this.sessionId == null || !this.sessionId.equals(sessionId)) {
            throw new UserAuthenticationException();
        }
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        userDTO.setPassword(DigestUtils.digest(userDTO.getPassword(), Algorithm.SHA256));
        User user = new User(userDTO);
        
        session.save(user);
        session.getTransaction().commit();

        return user.getId();
    }

    public boolean checkUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = (User) session
                .createCriteria(User.class, "u")
                .add(Restrictions.eq("u.username", username))
                .uniqueResult();
        
        session.getTransaction().commit();
        
        return user == null;
    }

}
