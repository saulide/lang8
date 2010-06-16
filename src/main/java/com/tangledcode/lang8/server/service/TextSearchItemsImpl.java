package com.tangledcode.lang8.server.service;

import java.util.List;

import org.hibernate.Session;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.service.TextSearchItemsService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class TextSearchItemsImpl extends RemoteServiceServlet implements TextSearchItemsService{


	public List<String> getSearchItems(String value, String text) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<String> returnValues = (List<String>) session.createQuery("select * from texts where ");
		return null;
	}

}
