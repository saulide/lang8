package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface UserLoggedInHandler extends EventHandler {

    void onUserLoggedIn(UserLoggedInEvent event);

}
