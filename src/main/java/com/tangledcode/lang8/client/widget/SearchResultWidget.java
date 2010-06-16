package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SearchResultWidget extends Composite {

	private static SearchResultWidgetUiBinder uiBinder = GWT
			.create(SearchResultWidgetUiBinder.class);

	@UiTemplate("ui/SearchResultWidget.ui.xml")
	interface SearchResultWidgetUiBinder extends
			UiBinder<Widget, SearchResultWidget> {
	}
	@UiField Label text;

	public SearchResultWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		this.text.setText("Peter");
	}

}
