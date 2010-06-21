package com.tangledcode.lang8.server.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.TextDTO;
import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.model.Text;
import com.tangledcode.lang8.client.service.TextSearchItemsService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class TextSearchItemsImpl extends RemoteServiceServlet implements TextSearchItemsService{


	public List<TextDTO> getSearchItems(String value, String text) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        List<Text> createQuery = (List<Text>) session
        	.createCriteria(Text.class, "t")
        	.add(Restrictions.eq("t." + text, value))
        	.list();
		session.getTransaction().commit();
		List<TextDTO> returnValues = new ArrayList<TextDTO>(createQuery != null ? createQuery.size() : 0);
		if (returnValues != null){
			for (Text texts: createQuery){
				returnValues.add(createTextDTO(texts));
			}
		}
		
		return returnValues;
	}

	private TextDTO createTextDTO(Text texts) {
		
		
		return new TextDTO(texts.getTitle(),texts.getDescription(),texts.getContent());
	}

}
