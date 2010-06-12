package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PasswordTextBox;
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
    @UiField PasswordTextBox passwordTextBox;
    @UiField PasswordTextBox passwordConfirmationTextBox;
    @UiField Button resetButton;
    @UiField Button registrationButton;
    @UiField Image usernameValid;
    @UiField Image usernameInvalid;
    @UiField Image passwordValid;
    @UiField Image passwordInvalid;
    
    final Resources resources = GWT.create(Resources.class);

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
    
    public HasKeyUpHandlers getPasswordKeyUpHandlers() {
        return this.passwordTextBox;
    }

    public HasKeyUpHandlers getPasswordConfirmationKeyUpHandlers() {
        return this.passwordConfirmationTextBox;
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
    
    public HasAllFocusHandlers getUsernameFocus() {
        return this.usernameTextBox;
    }
    
    public HasKeyPressHandlers getEmailKeyPressHandlers() {
        return this.emailTextBox;
    }

    public HasKeyPressHandlers getPasswordConfirmationKeyPressHandlers() {
        return this.passwordConfirmationTextBox;
    }

    public HasKeyPressHandlers getPasswordKeyPressHandlers() {
        return this.passwordTextBox;
    }

    public HasKeyPressHandlers getUsernameKeyPressHandlers() {
        return this.usernameTextBox;
    }

    public Widget asWidget() {
        return this;
    }

    public void onShow() {
        DeferredCommand.addCommand(new Command() {
            
            public void execute() {
                usernameTextBox.setFocus(true);
                usernameValid.setVisible(false);
                usernameInvalid.setVisible(false);
                passwordValid.setVisible(false);
                passwordInvalid.setVisible(false);
            }
        });
    }

    public void usernameInvalid() {
        this.usernameValid.setVisible(false);
        this.usernameInvalid.setVisible(true);
    }

    public void usernameValid() {
        this.usernameValid.setVisible(true);
        this.usernameInvalid.setVisible(false);
    }

    public void passwordInvalid() {
        this.passwordValid.setVisible(false);
        this.passwordInvalid.setVisible(true);
    }

    public void passwordValid() {
        this.passwordValid.setVisible(true);
        this.passwordInvalid.setVisible(false);
    }

}
