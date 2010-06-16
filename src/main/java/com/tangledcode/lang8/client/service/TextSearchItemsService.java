package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.TextDTO;

@RemoteServiceRelativePath("textSearchService")
public interface TextSearchItemsService extends RemoteService {
	

	List<TextDTO> getSearchItems(String value, String text);

}
