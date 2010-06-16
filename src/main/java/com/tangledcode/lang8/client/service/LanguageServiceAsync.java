package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.LanguageDTO;

public interface LanguageServiceAsync {

	void getLanguages(AsyncCallback<List<LanguageDTO>> callback);

	void getLanguageById(String id, AsyncCallback<LanguageDTO> callback);

}
