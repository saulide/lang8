package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class TextClickEvent extends GwtEvent<TextClickHandler> {

    private static Type<TextClickHandler> TYPE;

    public static Type<TextClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextClickHandler>());
    }

    public TextClickEvent() {
    }

    @Override
    protected void dispatch(TextClickHandler handler) {
        handler.onTextClick(this);
    }

    @Override
    public Type<TextClickHandler> getAssociatedType() {
        return getType();
    }

}
