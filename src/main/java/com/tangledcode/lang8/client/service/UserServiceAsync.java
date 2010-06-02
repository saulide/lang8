package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.UserDTO;

public interface UserServiceAsync {

    void authenticate(String username, String password, AsyncCallback<String> callback);

    void saveUser(UserDTO user, AsyncCallback<Long> callback);

    void getUser(long id, AsyncCallback<UserDTO> callback);

}
