package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.TextSearchPresenter.Display;

public class TextSearchWidget extends Composite implements Display{

	private static TextSearchWidgetUiBinder uiBinder = GWT
			.create(TextSearchWidgetUiBinder.class);

	@UiTemplate("ui/TextSearchWidget.ui.xml")
	interface TextSearchWidgetUiBinder extends UiBinder<Widget, TextSearchWidget> {
	}
	@UiField TextBox searchItem;
	@UiField ListBox searchPrefs;
	@UiField Button submitBtn;
	@UiField Label resultLabel;
	@UiField Label resultTitle;
	@UiField Label resultContent;

	public TextSearchWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		searchPrefs.addItem("title");
		searchPrefs.addItem("user");
		searchPrefs.addItem("language");
		
	}

	public Widget asWidget() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public HasText getSearchItem(){
		return searchItem;
	}
	
	public void setSearchPrefs(String item){
		searchPrefs.addItem(item);
	}
	
	public HasClickHandlers getSubmitBtnClickHandlers() {
		return this.submitBtn;
	}

	public void setResultLabel(String label) {
		this.resultLabel.setText(label);
		
	}
	public void setResultText(String content) {
		this.resultContent.setText(content);
		
	}

	public void setResultTitle(String resultTitle) {
		this.resultTitle.setText(resultTitle);
		
		
		
	}

	public ListBox getSelectedSearchValue() {
		// TODO Auto-generated method stub
		return this.searchPrefs;
	}



}
