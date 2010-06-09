package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class TextClickEvent extends GwtEvent<TextClickHandler> {

    private static Type<TextClickHandler> TYPE;

    public static Type<TextClickHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextClickHandler>());
    }
<<<<<<< HEAD
	@Override
	protected void dispatch(TextClickHandler handler) {
		handler.onTextClick(this);
		
	}
  
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<TextClickHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return getType();
	}

	
=======
>>>>>>> 456956b62d4cf4f2bf1ef4f65d8a475a13cdc907

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
