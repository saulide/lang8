package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.RegistrationPresenter.Display;


public class RegistrationWidget extends Composite implements Display {

    private static RegistrationWidgetUiBinder uiBinder = GWT.create(RegistrationWidgetUiBinder.class);

    @UiTemplate("ui/RegistrationWidget.ui.xml")
    interface RegistrationWidgetUiBinder extends UiBinder<Widget, RegistrationWidget> {
    }
    
    @UiField TextBox usernameTextBox;
    @UiField TextBox emailTextBox;
    @UiField TextBox passwordTextBox;
    @UiField TextBox passwordConfirmationTextBox;
    @UiField Button resetButton;
    @UiField Button registrationButton;

    public RegistrationWidget() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public HasText getEmailText() {
        return this.emailTextBox;
    }

    public HasText getPasswordConfirmationText() {
        return this.passwordConfirmationTextBox;
    }

    public HasText getPasswordText() {
        return this.passwordTextBox;
    }

    public HasClickHandlers getRegistrationClickHandlers() {
        return this.registrationButton;
    }

    public HasClickHandlers getResetClickHandlers() {
        return this.resetButton;
    }

    public HasText getUsernameText() {
        return this.usernameTextBox;
    }

    public Widget asWidget() {
        return this;
    }

}
