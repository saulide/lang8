package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface UserRegistrationHandler extends EventHandler {

    void onUserRegistration(UserRegistrationEvent event);
    
}
