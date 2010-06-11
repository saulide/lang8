package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class LogoutClickEvent extends GwtEvent<LogoutClickHandler> {

    private static Type<LogoutClickHandler> TYPE;

    public static Type<LogoutClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<LogoutClickHandler>());
    }

    @Override
    protected void dispatch(LogoutClickHandler handler) {
        handler.onLogoutClick(this);
    }

    @Override
    public Type<LogoutClickHandler> getAssociatedType() {
        return getType();
    }

}
