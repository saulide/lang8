package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.LanguagesDTO;

public interface LanguageServiceAsync {

	void getLanguages(AsyncCallback<List<LanguagesDTO>> callback);

}
