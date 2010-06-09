package com.tangledcode.lang8.client.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.event.shared.GwtEvent;

public class TextClickEvent extends GwtEvent<TextClickHandler> {

    private static final Logger logger = LoggerFactory.getLogger(TextClickEvent.class);

    private static Type<TextClickHandler> TYPE;

    public static Type<TextClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextClickHandler>());
    }

    public TextClickEvent() {
        logger.debug(">>> TextClickEvent fired");
    }

    @Override
    protected void dispatch(TextClickHandler handler) {
        handler.onTextClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<TextClickHandler> getAssociatedType() {
        return getType();
    }

}
