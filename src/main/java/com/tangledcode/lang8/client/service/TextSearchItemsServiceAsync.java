package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TextSearchItemsServiceAsync {

	void getSearchItems(String value, String text, AsyncCallback<List<String>> callback);

}
