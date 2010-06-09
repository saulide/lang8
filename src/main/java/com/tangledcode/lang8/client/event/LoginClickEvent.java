package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class LoginClickEvent extends GwtEvent<LoginClickHandler> {

    private static Type<LoginClickHandler> TYPE;

    public static Type<LoginClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<LoginClickHandler>());
    }

    public LoginClickEvent() {
    }

    @Override
    protected void dispatch(LoginClickHandler handler) {
        handler.onLoginClick(this);
    }

    @Override
    public Type<LoginClickHandler> getAssociatedType() {
        return getType();
    }

}
