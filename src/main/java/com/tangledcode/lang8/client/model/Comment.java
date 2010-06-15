package com.tangledcode.lang8.client.model;

import java.util.Date;

import com.tangledcode.lang8.client.dto.CommentDTO;

public class Comment {

	private long id;
    private long user_id;
    private long group_id;
    private String text;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    
    
    public Comment() {
    }

    public Comment(String text) {
    	this.text = text;
    }

    public Comment(String text, long user_id) {
        this.text = text;
        this.user_id = user_id;
    }
    
    public Comment(CommentDTO comment) {
        this(comment.getText(), comment.getUserId());
        this.id = comment.getId();
    }

    /*
     * GETTER
     */
    public long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public Long getUserId() {
        return this.user_id;
    }

    /*
     * SETTER
     */
    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserID(long user_id) {
        this.user_id = user_id;
    }

}
