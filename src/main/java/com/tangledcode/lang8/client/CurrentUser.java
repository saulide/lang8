package com.tangledcode.lang8.client;

import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.model.User;

public class CurrentUser {

    private static User currentUser = null;
    private static String sessionId = null;

    private CurrentUser() {
    }

    public static User getUser() {
        return CurrentUser.currentUser;
    }

    public static String getSessionId() {
        return CurrentUser.sessionId;
    }

    public static void setUser(UserDTO user, String sessionId) {
        if(CurrentUser.currentUser == null && CurrentUser.sessionId == null) {
            CurrentUser.currentUser = new User(user);
            CurrentUser.sessionId = sessionId;
        }
    }

    public static void reset() {
        CurrentUser.currentUser = null;
        CurrentUser.sessionId = null;
    }

    public static boolean isLoggedIn() {
        return CurrentUser.sessionId != null && CurrentUser.currentUser != null;
    }
}
