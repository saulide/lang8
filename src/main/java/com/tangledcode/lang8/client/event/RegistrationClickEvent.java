package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;

public class RegistrationClickEvent extends GwtEvent<RegistrationClickHandler> {

    private static final Logger logger = LoggerFactory.getLogger(RegistrationClickEvent.class);

    private static Type<RegistrationClickHandler> TYPE;

    public static Type<RegistrationClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<RegistrationClickHandler>());
    }

    public RegistrationClickEvent() {
        logger.debug(">>> RegistrationClickEvent fired");
    }

    @Override
    protected void dispatch(RegistrationClickHandler handler) {
        handler.onRegistrationClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<RegistrationClickHandler> getAssociatedType() {
        return getType();
    }

}
