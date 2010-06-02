package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display;

public class TextWidget extends Composite implements Display{

	private static TextWidgetUiBinder uiBinder = GWT.create(TextWidgetUiBinder.class);

	@UiTemplate("ui/TextWidget.ui.xml")
	interface TextWidgetUiBinder extends UiBinder<Widget, TextWidget> {
	}

	//@UiField HeadingElement username;
	
	
	public TextWidget(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	public Widget asWidget() {
		// TODO Auto-generated method stub
		return this;
	}

} 
