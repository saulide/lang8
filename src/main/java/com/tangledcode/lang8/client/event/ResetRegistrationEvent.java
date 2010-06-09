package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;

public class ResetRegistrationEvent extends GwtEvent<ResetRegistrationHandler> {

    private static final Logger logger = LoggerFactory.getLogger(ResetRegistrationEvent.class);
    
    private static Type<ResetRegistrationHandler> TYPE;

    public static Type<ResetRegistrationHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<ResetRegistrationHandler>());
    }

    public ResetRegistrationEvent() {
        logger.debug(">>> ResetRegistrationEvent");
    }

    @Override
    protected void dispatch(ResetRegistrationHandler handler) {
        handler.onResetRegistration(this);
    }

    @Override
    public Type<ResetRegistrationHandler> getAssociatedType() {
        return getType();
    }

}
