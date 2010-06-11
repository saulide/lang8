package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display;
import com.tangledcode.lang8.client.service.LanguageService;
import com.tangledcode.lang8.client.service.LanguageServiceAsync;

public class TextWidget extends Composite implements Display{

	private static TextWidgetUiBinder uiBinder = GWT.create(TextWidgetUiBinder.class);

	@UiTemplate("ui/TextWidget.ui.xml")
	interface TextWidgetUiBinder extends UiBinder<Widget, TextWidget> {
	}

	@UiField RichTextArea textInputField;
	@UiField TextArea titleText;
	@UiField ListBox listBoxLanguage;
	
	
	public TextWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		//LanguageServiceAsync conn = 
		
		
	}
	
	public HasHTML getEnteredText() {
		return this.textInputField;
	}

	
	public Widget asWidget() {
		return this;
	}


} 
