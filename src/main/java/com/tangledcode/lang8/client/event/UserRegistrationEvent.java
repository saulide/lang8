package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;
import com.tangledcode.lang8.client.model.User;

public class UserRegistrationEvent extends GwtEvent<UserRegistrationHandler> {

    private static final Logger logger = LoggerFactory.getLogger(UserRegistrationEvent.class);

    private static Type<UserRegistrationHandler> TYPE;

    private User user;

    public static Type<UserRegistrationHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<UserRegistrationHandler>());
    }

    public UserRegistrationEvent(User user) {
        logger.debug(">>> UserRegistrationEvent fired");
        
        this.user = user;
    }

    @Override
    protected void dispatch(UserRegistrationHandler handler) {
        handler.onUserRegistration(this);
    }

    @Override
    public Type<UserRegistrationHandler> getAssociatedType() {
        return getType();
    }

    public User getUser() {
        return this.user;
    }

}
