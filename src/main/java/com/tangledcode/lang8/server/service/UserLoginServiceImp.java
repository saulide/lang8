package com.tangledcode.lang8.server.service;

import org.hibernate.Session;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.service.UserLoginService;
import com.tangledcode.lang8.server.util.HibernateUtil;
import com.tangledcode.utils.DigestUtils;

public class UserLoginServiceImp extends RemoteServiceServlet implements UserLoginService {

    private static final long serialVersionUID = 7680230463891208130L;

    public String authenticate(String username, String password) {
        String sessionId = new String();

        if(username.equals("bacon") && password.equals("foobar")) {
            sessionId = DigestUtils.digest(System.currentTimeMillis() + "", DigestUtils.Algorithm.SHA256);
        }

        return sessionId;
    }

    public User getUser(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction();
        User user = (User) session.get(User.class, id);
        session.getTransaction().commit();

        return user;
    }

    public Long saveUser(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

        return user.getId();
    }

}
