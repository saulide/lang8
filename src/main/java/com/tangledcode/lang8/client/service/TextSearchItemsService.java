package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("textSearchService")
public interface TextSearchItemsService extends RemoteService {
	

	List<String> getSearchItems(String value, String text);

}
