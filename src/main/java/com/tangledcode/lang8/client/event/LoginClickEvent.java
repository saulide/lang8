package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;

public class LoginClickEvent extends GwtEvent<LoginClickHandler> {

    private static final Logger logger = LoggerFactory.getLogger(LoginClickEvent.class);

    private static Type<LoginClickHandler> TYPE;

    public static Type<LoginClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<LoginClickHandler>());
    }

    public LoginClickEvent() {
        logger.debug(">>> LoginClickEvent fired");
    }

    @Override
    protected void dispatch(LoginClickHandler handler) {
        handler.onLoginClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<LoginClickHandler> getAssociatedType() {
        return getType();
    }

}
