package com.tangledcode.lang8.client.model;

import java.util.HashSet;
import java.util.Set;

import com.tangledcode.lang8.client.dto.LanguageDTO;

public class Language {

	/**
	 * 
	 */
	private String id;
	private String title;
	private Set texts = new HashSet();
	
	public Language() {
		// TODO Auto-generated constructor stub
	}
	public Language(LanguageDTO lanDTO){
		id = lanDTO.getId();
		title = lanDTO.getTitle();
	}
	public Language(String id2, Set texts2, String title2) {
		this.id = id2;
		this.texts = texts2;
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
	public Set getTexts() {
		return texts;
	}
	public void setTexts(Set texts) {
		this.texts = texts;
	}

}
