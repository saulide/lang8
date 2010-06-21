package com.tangledcode.lang8.client.model;

import java.util.Date;

import com.tangledcode.lang8.client.dto.TextDTO;

public class Text {
	
	private long id;
	private String title;
	private String description;
	private String content;
	private User user;
	private Language lang_id;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	
	public Text(){
		
	}
	
	public Text(TextDTO text) {
		this.title = text.getTitle();
		this.description = text.getDescription();
		this.user = new User(text.getUser_id());
		this.lang_id = new Language(text.getLanguage_id());
		this.content = text.getContent();
	}
	
	public Text(String title, String desString, String content, User user_id, Language string) {
		this.title = title;
		this.description = desString;
		this.user = user_id;
		this.setLang_id(string);	
		this.setContent(content);
	}
	
	public Text(String title2, String description2) {
		this.title = title2;
		this.description = description2;
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
	public User getUser() {
		return user;
	}
	public void setUser(User userId) {
		user = userId;
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

	public void setLang_id(Language string) {
		this.lang_id = string;
	}

	public Language getLang_id() {
		return lang_id;
	}

}
