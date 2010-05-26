package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.model.User;

public interface UserLoginServiceAsync {

    void authenticate(String username, String password, AsyncCallback<String> callback);

    void saveUser(User user, AsyncCallback<Long> callback);

    void getUser(Long id, AsyncCallback<User> callback);

}
