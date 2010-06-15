package com.tangledcode.lang8.server.service;

import org.hibernate.Session;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tangledcode.lang8.client.dto.GroupDTO;
import com.tangledcode.lang8.client.model.Group;
import com.tangledcode.lang8.client.service.GroupService;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class GroupServiceImp extends RemoteServiceServlet implements GroupService {

   private static final long serialVersionUID = -7047801164572985605L;

    public GroupDTO getGroup(long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Group group = (Group) session.get(Group.class, id);
        
        GroupDTO groupDTOTranslate = new GroupDTO(group);
        
        session.getTransaction().commit();

        return groupDTOTranslate;
    }

    public long saveGroup(GroupDTO groupDTO) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Group group = new Group(groupDTO);
        
        session.save(group);
        session.getTransaction().commit();

        return group.getId();
    }

}
