package com.tangledcode.lang8.client.dto;

import java.io.Serializable;

import com.tangledcode.lang8.client.model.User;

public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 168393219154326854L;

    private UserDTO user;
    private String sessionId;
    
    
    public AuthenticationResponse() {

    }

    public AuthenticationResponse(User user, String sessionId) {
        this.user = new UserDTO(user);
        this.sessionId = sessionId;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public String getSessionId() {
        return this.sessionId;
    }
    
    @Override
    public String toString() {
        return this.user.getUsername() + " " + this.sessionId;
    }

}
