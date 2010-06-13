package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.TextSearchPresenter.Display;

public class TextSearchWidget extends Composite implements Display{

	private static TextSearchWidgetUiBinder uiBinder = GWT
			.create(TextSearchWidgetUiBinder.class);

	@UiTemplate("ui/TextSearchWidget.ui.xml")
	interface TextSearchWidgetUiBinder extends UiBinder<Widget, TextSearchWidget> {
	}

	@UiField
	Button button;

	public TextSearchWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	public Widget asWidget() {
		// TODO Auto-generated method stub
		return this;
	}

}
