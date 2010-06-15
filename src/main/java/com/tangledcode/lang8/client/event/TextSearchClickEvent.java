package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class TextSearchClickEvent extends GwtEvent<TextSearchClickHandler> {

    private static Type<TextSearchClickHandler> TYPE;

    public static Type<TextSearchClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextSearchClickHandler>());
    }

    public TextSearchClickEvent() {
    }

    @Override
    protected void dispatch(TextSearchClickHandler handler) {
        handler.onTextSearchClick(this);
    }

    @Override
    public Type<TextSearchClickHandler> getAssociatedType() {
        return getType();
    }

}
