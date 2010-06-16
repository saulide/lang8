package com.tangledcode.lang8.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display.SubmitTextDetails;


public class TextSubmitEvent extends GwtEvent<TextSubmitHandler> {
	
	private static Type<TextSubmitHandler> TYPE;
	private SubmitTextDetails text;
	
    public TextSubmitEvent(SubmitTextDetails submitTextDetailsImp) {
		this.text = submitTextDetailsImp;
	}

	public static Type<TextSubmitHandler> getType() {
        return TYPE != null
                ? TYPE
                : (TYPE = new Type<TextSubmitHandler>());
    }

	@Override
	protected void dispatch(TextSubmitHandler arg0) {
		arg0.onSubmitClick(this);
		
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<TextSubmitHandler> getAssociatedType() {
		return getType();
	}


	public SubmitTextDetails getText() {
		return text;
	}

}
