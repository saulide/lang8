package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.AuthenticationResponse;
import com.tangledcode.lang8.client.dto.UserDTO;

public interface UserServiceAsync {

    void authenticate(String username, String password, AsyncCallback<AuthenticationResponse> callback);

    void saveUser(UserDTO user, String sessionId, AsyncCallback<Long> callback);

    void getUser(long id, String sessionId, AsyncCallback<UserDTO> callback);

    void checkUsername(String username, AsyncCallback<Boolean> callback);

}
