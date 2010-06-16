package com.tangledcode.lang8.client.dto;

import java.io.Serializable;

import com.tangledcode.lang8.client.model.Language;

public class LanguageDTO implements Serializable{
	
	private static final long serialVersionUID = 6453734377788847334L;
	private String id;
	private String title;
	
	public LanguageDTO() {
	}

	public LanguageDTO(String string, String title2) {
		this.id = string;
		this.title = title2;
	}
	
	

	public LanguageDTO(Language langId) {
		this.id = langId.getId();
		this.title = langId.getTitle();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
