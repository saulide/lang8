package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.AuthenticationResponse;
import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.exception.UserAuthenticationException;

@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService {

    AuthenticationResponse authenticate(String username, String password) throws UserAuthenticationException;

    UserDTO getUser(long id, String sessionId) throws UserAuthenticationException;

    long saveUser(UserDTO user) throws UserAuthenticationException;
    
    boolean checkUsername(String username);

}
