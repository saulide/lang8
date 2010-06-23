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

    public Long getUser_id() {
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

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

	public long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(long groupId) {
		group_id = groupId;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date createdAt) {
		created_at = createdAt;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updatedAt) {
		updated_at = updatedAt;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deletedAt) {
		deleted_at = deletedAt;
	}

}
