package com.tangledcode.lang8.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.tangledcode.lang8.client.CurrentUser;
import com.tangledcode.lang8.client.model.Group;
import com.tangledcode.lang8.client.model.User;

public class GroupDTO implements Serializable {
    private static final long serialVersionUID = 7075169739567878260L;
	
    private int id;
    private UserDTO user;
    private int language_id;
    private String title;
    private String describtion;
    private long userId;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    
    
    public GroupDTO() {
    }
    
    public GroupDTO(int id, String title, String describtion) {
        this.id = id;
        this.title = title;
        this.describtion = describtion;
        this.userId = CurrentUser.getUser().getId();
    }
    
    public GroupDTO(int id, String title, String describtion, long userId) {
        this.id = id;
        this.title = title;
        this.describtion = describtion;
        this.userId = userId;
    }
    
    public GroupDTO(int id, String title, String describtion, User user) {
        this.id = id;
        this.title = title;
        this.describtion = describtion;
        this.user = new UserDTO(user);
    }
    
    public GroupDTO(Group group) {
        this(group.getId(), group.getTitle(), group.getDescribtion(), group.getUserId());
    }
    
    /*
     * GETTER
     */
    public int getId() {
        return this.id;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getDescribtion() {
        return this.describtion;
    }
    
    public UserDTO getUser() {
    	return this.user;
    }
    
    public long getUserId() {
    	return this.userId;
    }
    
    /*
     * SETTER
     */
    public void setId(int id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
    
    public void setUser(UserDTO user) {
        this.user = user;
    }
    
    public void setUserId(long userId) {
    	this.userId = userId;
    }
    
}
