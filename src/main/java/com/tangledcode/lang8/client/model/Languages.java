package com.tangledcode.lang8.client.model;

import com.tangledcode.lang8.client.dto.LanguagesDTO;

public class Languages {

	/**
	 * 
	 */
	private String id;
	private String title;
	
	public Languages() {
		// TODO Auto-generated constructor stub
	}
	public Languages(LanguagesDTO lanDTO){
		id = lanDTO.getId();
		title = lanDTO.getTitle();
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
