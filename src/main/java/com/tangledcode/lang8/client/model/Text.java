package com.tangledcode.lang8.client.model;

import java.util.Date;

import com.tangledcode.lang8.client.dto.TextDTO;

public class Text {
	
	private long id;
	private String title;
	private String description;
	private String content;
	private long user_id;
	private String lang_id;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	
	public Text(TextDTO text) {
		this.title = text.getTitle();
		this.description = text.getDescription();
		this.user_id = text.getUser_id();
		this.lang_id = text.getLanguage_id();
		this.content = text.getContent();
	}
	
	public Text(String title, String desString, String content, long user_id, String string) {
		this.title = title;
		this.description = desString;
		this.user_id = user_id;
		this.setLang_id(string);	
		this.setContent(content);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(int userId) {
		user_id = userId;
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

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setLang_id(String string) {
		this.lang_id = string;
	}

	public String getLang_id() {
		return lang_id;
	}

}
