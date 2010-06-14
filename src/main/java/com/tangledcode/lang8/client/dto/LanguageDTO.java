package com.tangledcode.lang8.client.dto;

import java.io.Serializable;

public class LanguageDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6453734377788847334L;
	private String id;
	private String title;
	
	public LanguageDTO() {
		// TODO Auto-generated constructor stub
	}

	public LanguageDTO(String string, String title2) {
		this.id = string;
		this.title = title2;
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
