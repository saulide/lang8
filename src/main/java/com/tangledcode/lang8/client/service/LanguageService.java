package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.tangledcode.lang8.client.dto.LanguagesDTO;

public interface LanguageService extends RemoteService{
	
	List<LanguagesDTO> getLanguages();

}
