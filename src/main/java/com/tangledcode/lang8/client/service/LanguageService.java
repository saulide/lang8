package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.LanguagesDTO;
import com.tangledcode.lang8.client.exception.UserAuthenticationException;

@RemoteServiceRelativePath("languages")
public interface LanguageService extends RemoteService{
	
	List<LanguagesDTO> getLanguages() throws UserAuthenticationException;

}
