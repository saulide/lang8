package com.tangledcode.lang8.server.service;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.service.UserService;
import com.tangledcode.lang8.server.util.HibernateUtil;
import com.tangledcode.utils.DigestUtils;
import com.tangledcode.utils.DigestUtils.Algorithm;

public class UserServiceImp extends RemoteServiceServlet implements UserService {

    private static final long serialVersionUID = 7680230463891208130L;

    public String authenticate(String username, String password) {
        String sessionId = new String();
        String digestedPassword = DigestUtils.digest(password, DigestUtils.Algorithm.SHA256);
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = (User) session
                .createCriteria(User.class, "u")
                .add(Restrictions.eq("u.username", username))
                .add(Restrictions.eq("u.password", digestedPassword))
                .uniqueResult();
        
        session.getTransaction().commit();

        if(user != null) {
            sessionId = DigestUtils.digest(System.currentTimeMillis() + "", DigestUtils.Algorithm.SHA256);
        }

        return sessionId;
    }

    public UserDTO getUser(long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = (User) session.get(User.class, id);
        
        session.getTransaction().commit();

        return new UserDTO(user);
    }

    public Long saveUser(UserDTO userDTO) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        userDTO.setPassword(DigestUtils.digest(userDTO.getPassword(), Algorithm.SHA256));
        User user = new User(userDTO);
        
        session.save(user);
        session.getTransaction().commit();

        return user.getId();
    }

}
