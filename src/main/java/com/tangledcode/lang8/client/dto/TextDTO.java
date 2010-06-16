package com.tangledcode.lang8.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.tangledcode.lang8.client.model.Text;

public class TextDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7139458059264849545L;
	private long id;
	private String title;
	private String description;
	private UserDTO user;
	private LanguageDTO language_id;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	private String content;
	
	public TextDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public TextDTO(String title, String desString, UserDTO user_id, LanguageDTO language_id) {
		this.title = title;
		this.description = desString;
		this.user = user_id;
		this.language_id = language_id;	
	}
	
	public TextDTO(Text text) {
		this.id = text.getId();
		this.title = text.getTitle();
		this.description = text.getDescription();
		this.setContent(text.getContent());
		this.user = new UserDTO(text.getUser());
		this.language_id = new LanguageDTO(text.getLang_id());
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
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
	public UserDTO getUser_id() {
		return user;
	}
	public void setUser_id(UserDTO userId) {
		user = userId;
	}
	public LanguageDTO getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(LanguageDTO languageId) {
		language_id = languageId;
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

	public String getContent() {
		// TODO Auto-generated method stub
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
