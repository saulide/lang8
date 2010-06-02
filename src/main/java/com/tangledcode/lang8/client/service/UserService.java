package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.UserDTO;

@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService {

    String authenticate(String username, String password);

    UserDTO getUser(long id);

    Long saveUser(UserDTO user);

}
