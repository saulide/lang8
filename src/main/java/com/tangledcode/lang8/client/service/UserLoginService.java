package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.model.User;

@RemoteServiceRelativePath("login")
public interface UserLoginService extends RemoteService {

    String authenticate(String username, String password);

    User getUser(Long id);

    Long saveUser(User user);

}
