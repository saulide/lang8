package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class ResetRegistrationEvent extends GwtEvent<ResetRegistrationHandler> {

    private static Type<ResetRegistrationHandler> TYPE;

    public static Type<ResetRegistrationHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<ResetRegistrationHandler>());
    }

    public ResetRegistrationEvent() {
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
