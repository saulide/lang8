package com.tangledcode.lang8.server.service;

import java.util.List;

import org.hibernate.Session;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.TextDTO;
import com.tangledcode.lang8.client.model.Text;
import com.tangledcode.lang8.client.service.TextService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class TextServiceImp extends RemoteServiceServlet implements TextService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7165503427473742142L;

	public TextDTO getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TextDTO> getTextList() {
		// TODO Auto-generated method stub
		return null;
	}

	public long sendText(TextDTO text) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Text newtext = new Text(text);
        session.save(newtext);
        session.getTransaction().commit();

        return text.getId();
		// TODO Auto-generated method stub
		
	}

}
