package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.tangledcode.lang8.client.model.Group;

public class NewGroupEvent extends GwtEvent<NewGroupHandler> {

    private static Type<NewGroupHandler> TYPE;
    
    private Group group;

    public static Type<NewGroupHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<NewGroupHandler>());
    }
    
    public NewGroupEvent(Group group) {
        this.group = group;
    }

    @Override
    protected void dispatch(NewGroupHandler handler) {
        handler.onNewGroupClick(this);
    }

    @Override
    public Type<NewGroupHandler> getAssociatedType() {
        return getType();
    }

    public Group getGroup() {
        return this.group;
    }

}
