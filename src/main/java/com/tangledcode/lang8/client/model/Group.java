package com.tangledcode.lang8.client.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.tangledcode.lang8.client.dto.GroupDTO;

@Entity
public class Group {

    @Id private int id;
    @OneToOne 
    @JoinColumn (name="user_id")
    private User user;
    private int language_id;
    private String title;
    private String describtion;
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
    }
    
    public Group(String title, String describtion, User user) {
        this.title = title;
        this.describtion = describtion;
        this.user= user;
    }
    
    public Group(GroupDTO group) {
        this(group.getTitle(), group.getDescribtion(), new User(group.getUser()));
        this.id = group.getId();
    }

    /*
     * GETTER
     */
    public int getId() {
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

    /*
     * SETTER
     */
    public void setId(int id) {
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

}
