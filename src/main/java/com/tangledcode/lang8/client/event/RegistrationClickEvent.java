package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class RegistrationClickEvent extends GwtEvent<RegistrationClickHandler> {

    private static Type<RegistrationClickHandler> TYPE;

    public static Type<RegistrationClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<RegistrationClickHandler>());
    }

    public RegistrationClickEvent() {
    }

    @Override
    protected void dispatch(RegistrationClickHandler handler) {
        handler.onRegistrationClick(this);
    }

    @Override
    public Type<RegistrationClickHandler> getAssociatedType() {
        return getType();
    }

}
