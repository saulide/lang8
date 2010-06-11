package com.tangledcode.lang8.client.model;

import com.tangledcode.lang8.client.dto.UserDTO;

public class User {

    private long id;
    private String username;
    private String email;
    private String password;
    
    public User() {
    }

    public User(String username, String password) {
        this(username, null, password);
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public User(UserDTO user) {
        this(user.getUsername(), user.getEmail(), user.getPassword());
        this.id = user.getId();
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
    public void setId(long id) {
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
