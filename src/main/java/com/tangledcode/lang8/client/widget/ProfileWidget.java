package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.ProfilePresenter.Display;

public class ProfileWidget extends Composite implements Display {

    private static ProfileWidgetUiBinder uiBinder = GWT.create(ProfileWidgetUiBinder.class);

    @UiTemplate("ui/ProfileWidget.ui.xml")
    interface ProfileWidgetUiBinder extends UiBinder<Widget, ProfileWidget> {
    }

    @UiField HeadingElement username;
    @UiField SpanElement email;

    public ProfileWidget() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setEmail(String email) {
        this.email.setInnerText(email);
    }

    public void setUsername(String username) {
        this.username.setInnerText(username);
    }

    public Widget asWidget() {
        return this;
    }

}
