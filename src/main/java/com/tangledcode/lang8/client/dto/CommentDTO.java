package com.tangledcode.lang8.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.tangledcode.lang8.client.model.Comment;

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 7075169739567878260L;
	
    private long id;
    private long user_id;
    private long group_id;
    private String text;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    
    
    public CommentDTO() {
    }
    
    public CommentDTO(long id, String text) {
        this.id = id;
        this.text = text;
    }
    
    public CommentDTO(long id, String text, long user_id) {
        this.id = id;
        this.user_id = user_id;
        this.text = text;
    }
    
    public CommentDTO(Comment comment) {
        this(comment.getId(), comment.getText(), comment.getUserId());
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
    
    public long getUserId() {
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
