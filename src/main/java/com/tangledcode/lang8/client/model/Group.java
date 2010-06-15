package com.tangledcode.lang8.client.model;

import java.util.Date;

import org.hibernate.Session;

import com.tangledcode.lang8.client.dto.GroupDTO;
import com.tangledcode.lang8.server.util.HibernateUtil;

public class Group {

    private long id;
    private User user;
    private long language_id;
    private String title;
    private String describtion;
    private long userId;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    
    
    public Group() {
    }

    public Group(String title) {
        this(title, null);
    }

    public Group(String title, String describtion) {
        this.title = title;
        this.describtion = describtion;
        //this.userId = CurrentUser.getUser().getId();
    }
    
    public Group(String title, String describtion, User user) {
        this.title = title;
        this.describtion = describtion;
        this.user= user;
        this.userId = user.getId();
    }
    
    public Group(GroupDTO group) {
        this(group.getTitle(), group.getDescribtion());//), new User(group.getUser()));
        this.id = group.getId();
        this.userId = group.getUserId();
    }

    /*
     * GETTER
     */
    public long getId() {
        return this.id;
    }
    
    public User getUser() {
    	return this.user;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescribtion() {
        return this.describtion;
    }
    
    public long getUserId() {
    	return this.userId;
    }
    
    public String getUserIdToString() {
    	return String.valueOf(this.userId);
    }
    
    public String getUserName() {
    	return "Error.";
    }

    /*
     * SETTER
     */
    public void setId(long id) {
        this.id = id;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
    
    public void setUserId(long userId) {
    	this.userId = userId;
    }

}
