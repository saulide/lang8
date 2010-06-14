package com.tangledcode.lang8.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.TextDTO;

public interface TextServiceAsync {

	void getText(AsyncCallback<TextDTO> callback);

	void getTextList(AsyncCallback<List<TextDTO>> callback);

	void sendText(TextDTO text, AsyncCallback<Long> callback);

}
