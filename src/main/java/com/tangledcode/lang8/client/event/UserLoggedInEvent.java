package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;

public class UserLoggedInEvent extends GwtEvent<UserLoggedInHandler> {

    private static final Logger logger = LoggerFactory.getLogger(UserLoggedInEvent.class);

    private static Type<UserLoggedInHandler> TYPE;

    public static Type<UserLoggedInHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<UserLoggedInHandler>());
    }

    public UserLoggedInEvent() {
        logger.debug(">>> UserLoggedInEvent fired");
    }

    @Override
    protected void dispatch(UserLoggedInHandler handler) {
        handler.onUserLoggedIn(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<UserLoggedInHandler> getAssociatedType() {
        return null;
    }

}
