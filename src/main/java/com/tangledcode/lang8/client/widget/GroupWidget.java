package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.GroupPresenter.Display;

public class GroupWidget extends Composite implements Display{

	private static GroupWidgetUiBinder uiBinder = GWT.create(GroupWidgetUiBinder.class);

	@UiTemplate("ui/GroupWidget.ui.xml")
	interface GroupWidgetUiBinder extends UiBinder<Widget, GroupWidget> {
	}
	
	@UiField public TextBox newGroupTitle;
	@UiField public TextArea newGroupDescribtion;
	@UiField Button newGroupButton;

	public GroupWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		newGroupButton.setText("Create new group");
	}
	
	public HasText getNewGroupTitle() {
        return this.newGroupTitle;
    }
	
	public HasText getNewGroupDescribtion() {
        return this.newGroupDescribtion;
    }
	
	public HasClickHandlers getNewGroupButtonClickHandlers() {
        return this.newGroupButton;
    }

	public Widget asWidget() {
		return this;
	}

} 
