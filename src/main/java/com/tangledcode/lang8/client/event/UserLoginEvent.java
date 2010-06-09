package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;
import com.tangledcode.lang8.client.model.User;

public class UserLoginEvent extends GwtEvent<UserLoginHandler> {

    private static final Logger logger = LoggerFactory.getLogger(UserLoginEvent.class);

    private static Type<UserLoginHandler> TYPE;

    public static Type<UserLoginHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<UserLoginHandler>());
    }

    private User user;

    public UserLoginEvent(User user) {
        logger.debug(">>> UserLoginEvent fired");

        this.user = user;
    }

    @Override
    protected void dispatch(UserLoginHandler handler) {
        handler.onUserLogin(this);
    }

    @Override
    public Type<UserLoginHandler> getAssociatedType() {
        return getType();
    }

    public User getUser() {
        return this.user;
    }

}
