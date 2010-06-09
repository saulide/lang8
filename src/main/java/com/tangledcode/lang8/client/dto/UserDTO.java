package com.tangledcode.lang8.client.dto;

import java.io.Serializable;

import com.tangledcode.lang8.client.model.User;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1643655963745681506L;

    private long id;
    private String username;
    private String email;
    private String password;
    
    public UserDTO() {
    }
    
    public UserDTO(long id, String username, String email, String password, String sessionId) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public UserDTO(User user) {
        this(user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), null);
    }
    
    /*
     * GETTER
     */
    public long getId() {
        return this.id;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    /*
     * SETTER
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
