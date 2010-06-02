package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class TextClickEvent extends GwtEvent<TextClickHandler> {

	private static Type<TextClickHandler> TYPE;

    public static Type<TextClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextClickHandler>());
    }
	@Override
	protected void dispatch(TextClickHandler handler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<TextClickHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
