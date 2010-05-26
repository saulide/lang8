package com.tangledcode.lang8.client.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -4275262499628453954L;

    private Long id;
    private String username;
    private String email;
    private String password;
//    private String passwordConfirmation;
    
    
    public User() {
    }
    
    public User(Long id) {
        this.id = id;
    }

    public User(String username, String password) {
        this(username, null, password);
    }

//    public User(String username, String email, String password) {
//        this(username, email, password, null);
//    }

    public User(String username, String email, String password) { //, String passwordConfirmation) {
        this.username = username;
        this.email = email;
        this.password = password;
//        this.passwordConfirmation = passwordConfirmation;
    }

    public Long getId() {
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

//    public String getPasswordConfirmation() {
//        return this.passwordConfirmation;
//    }

}
