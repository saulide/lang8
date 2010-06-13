package com.tangledcode.lang8.server.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.LanguagesDTO;
import com.tangledcode.lang8.client.exception.UserAuthenticationException;
import com.tangledcode.lang8.client.model.Languages;
import com.tangledcode.lang8.client.service.LanguageService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class LanguageServiceImp extends RemoteServiceServlet implements LanguageService {



	public List<LanguagesDTO> getLanguages() throws UserAuthenticationException {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Languages> languages = new ArrayList<Languages>(session.createQuery("from languages").list());
        System.out.println("hier kommen die langs" + languages.get(0).getTitle());
        List<LanguagesDTO> languagesDTOs = new ArrayList<LanguagesDTO>(languages != null ? languages.size() : 0);
        if (languages != null) {
        	for (Languages lang : languages){
        		languagesDTOs.add(createLanguageDTO(lang));
        	}
        }
        session.getTransaction().commit();
        if(languages == null) {
            throw new UserAuthenticationException();
        }
//		List<Languages> languages = new ArrayList<Languages>(session.ge)
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
        
        //Languages 
		return languagesDTOs;
	}

	private LanguagesDTO createLanguageDTO(Languages lang) {
		// TODO Auto-generated method stub
		return new LanguagesDTO(lang.getId(), lang.getTitle());
	}

}
