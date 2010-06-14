package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.GroupPresenter.Display;

public class GroupWidget extends Composite implements Display{

	private static GroupWidgetUiBinder uiBinder = GWT.create(GroupWidgetUiBinder.class);

	@UiTemplate("ui/GroupWidget.ui.xml")
	interface GroupWidgetUiBinder extends UiBinder<Widget, GroupWidget> {
	}
	
	@UiField public Label groupTitle_1;
	@UiField public SpanElement groupDescribtion_1;
	@UiField public Label groupUser_1;
	
	@UiField public Label groupTitle_2;
	@UiField public SpanElement groupDescribtion_2;
	@UiField public Label groupUser_2;
	
	@UiField public Label groupTitle_3;
	@UiField public SpanElement groupDescribtion_3;
	@UiField public Label groupUser_3;
	
	
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
	
	// Groups

	public void setGroupTitle_1(String groupTitle) {
		this.groupTitle_1.setText(groupTitle);
	}

	public void setGroupUser_1(String groupUser) {
		this.groupUser_1.setText(String.valueOf(groupUser));
	}

	public void setGroupdescribtion_1(String groupDescribtion) {
		this.groupDescribtion_1.setInnerText(groupDescribtion);
	}
	
	public void setGroupTitle_2(String groupTitle) {
		this.groupTitle_2.setText(groupTitle);
	}

	public void setGroupUser_2(String groupUser) {
		this.groupUser_2.setText(String.valueOf(groupUser));
	}

	public void setGroupdescribtion_2(String groupDescribtion) {
		this.groupDescribtion_2.setInnerText(groupDescribtion);
	}
	
	public void setGroupTitle_3(String groupTitle) {
		this.groupTitle_3.setText(groupTitle);
	}

	public void setGroupUser_3(String groupUser) {
		this.groupUser_3.setText(String.valueOf(groupUser));
	}

	public void setGroupdescribtion_3(String groupDescribtion) {
		this.groupDescribtion_3.setInnerText(groupDescribtion);
	}
	
	// Stuff
	
	public Widget asWidget() {
		return this;
	}

} 
