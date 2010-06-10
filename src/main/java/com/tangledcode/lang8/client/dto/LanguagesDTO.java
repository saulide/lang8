package com.tangledcode.lang8.client.dto;

import java.io.Serializable;

public class LanguagesDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6453734377788847334L;
	private int id;
	private String title;
	
	public LanguagesDTO() {
		// TODO Auto-generated constructor stub
	}

	public LanguagesDTO(int id2, String title2) {
		this.id = id2;
		this.title = title2;
	}

	public int getId() {
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

}
