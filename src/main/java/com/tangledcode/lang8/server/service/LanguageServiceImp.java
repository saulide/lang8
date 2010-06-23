package com.tangledcode.lang8.server.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.LanguageDTO;
import com.tangledcode.lang8.client.exception.UserAuthenticationException;
import com.tangledcode.lang8.client.model.Language;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.service.LanguageService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class LanguageServiceImp extends RemoteServiceServlet implements LanguageService {

    private static final long serialVersionUID = -6413707784739322095L;

    public List<LanguageDTO> getLanguages() throws UserAuthenticationException {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Language> languages = session
                .createCriteria(Language.class)
                .addOrder(Property.forName("title").asc())
                .list();
        session.getTransaction().commit();

        //     
        //        List<Language> languages = new ArrayList<Language>(session.createQuery("from languages").list());
        //        System.out.println("hier kommen die langs" + languages.get(0).getTitle());
        //        session.getTransaction().commit();
        List<LanguageDTO> languagesDTOs = new ArrayList<LanguageDTO>(languages != null ? languages.size() : 0);
        if(languages != null) {
            for(Language lang : languages) {
                languagesDTOs.add(createLanguageDTO(lang));
            }
        }

        if(languages == null) {
            throw new UserAuthenticationException();
        }

        //Languages 
        return languagesDTOs;
    }

    private LanguageDTO createLanguageDTO(Language lang) {
        // TODO Auto-generated method stub
        return new LanguageDTO(lang.getId(), lang.getTitle());
    }

	public LanguageDTO getLanguageById(String id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Language lang = (Language) session.createCriteria(Language.class, "l")
        	.add(Restrictions.eq("l.title", id))
        	.uniqueResult();
        session.getTransaction().commit();
        LanguageDTO langDto = new LanguageDTO(lang.getId(), lang.getTitle());
        
        return langDto;
        
	}

}
