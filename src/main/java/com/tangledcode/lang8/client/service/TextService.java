package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.TextDTO;

@RemoteServiceRelativePath("sendText")
public interface TextService extends RemoteService {
	
	TextDTO getText();
	List<TextDTO> getTextList();
	long sendText(TextDTO text);

}
