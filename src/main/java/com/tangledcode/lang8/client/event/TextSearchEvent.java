package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display.SubmitTextDetails;


public class TextSearchEvent extends GwtEvent<TextSearchHandler> {
	
	private static Type<TextSearchHandler> TYPE;
	private String text;
	private String value;
	
    public TextSearchEvent(String text, String value) {
    	this.setText(text);
    	this.setValue(value);
	}

	public static Type<TextSearchHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextSearchHandler>());
    }

	@Override
	protected void dispatch(TextSearchHandler arg0) {
		arg0.onSubmitClick(this);
		
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<TextSearchHandler> getAssociatedType() {
		return getType();
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
