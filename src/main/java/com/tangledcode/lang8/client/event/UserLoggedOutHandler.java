package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface UserLoggedOutHandler extends EventHandler {

    void onUserLoggout(UserLoggedOutEvent event);

}
