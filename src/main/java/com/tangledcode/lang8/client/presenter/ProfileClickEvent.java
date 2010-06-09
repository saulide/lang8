package com.tangledcode.lang8.client.presenter;

import com.google.gwt.event.shared.GwtEvent;

public class ProfileClickEvent extends GwtEvent<ProfileClickHandler> {

    private static Type<ProfileClickHandler> TYPE;

    public static Type<ProfileClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<ProfileClickHandler>());
    }
    
    private long id;
    
    public ProfileClickEvent(long id) {
        this.id = id;
    }

    @Override
    protected void dispatch(ProfileClickHandler handler) {
        handler.onProfileClick(this);
    }

    @Override
    public Type<ProfileClickHandler> getAssociatedType() {
        return getType();
    }
    
    public long getId() {
        return this.id;
    }

}
