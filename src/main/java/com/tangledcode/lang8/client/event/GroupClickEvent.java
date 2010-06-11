package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class GroupClickEvent extends GwtEvent<GroupClickHandler> {

    private static Type<GroupClickHandler> TYPE;

    public static Type<GroupClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<GroupClickHandler>());
    }

    public GroupClickEvent() {
    }

    @Override
    protected void dispatch(GroupClickHandler handler) {
        handler.onGroupClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<GroupClickHandler> getAssociatedType() {
        return getType();
    }

}
