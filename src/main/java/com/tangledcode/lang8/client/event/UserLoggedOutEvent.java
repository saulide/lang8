package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class UserLoggedOutEvent extends GwtEvent<UserLoggedOutHandler> {

    private static Type<UserLoggedOutHandler> TYPE;

    public static Type<UserLoggedOutHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<UserLoggedOutHandler>());
    }

    @Override
    protected void dispatch(UserLoggedOutHandler handler) {
        handler.onUserLoggout(this);
    }

    @Override
    public Type<UserLoggedOutHandler> getAssociatedType() {
        return getType();
    }

}
