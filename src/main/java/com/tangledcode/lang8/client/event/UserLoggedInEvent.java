package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class UserLoggedInEvent extends GwtEvent<UserLoggedInHandler> {

    private static Type<UserLoggedInHandler> TYPE;

    public static Type<UserLoggedInHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<UserLoggedInHandler>());
    }

    public UserLoggedInEvent() {
    }

    @Override
    protected void dispatch(UserLoggedInHandler handler) {
        handler.onUserLoggedIn(this);
    }

    @Override
    public Type<UserLoggedInHandler> getAssociatedType() {
        return getType();
    }

}
