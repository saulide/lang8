package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.event.ResetRegistrationEvent;
import com.tangledcode.lang8.client.event.UserRegistrationEvent;
import com.tangledcode.lang8.client.presenter.RegistrationPresenter.Display;
import com.tangledcode.lang8.client.presenter.RegistrationPresenter.Display.UserRegistrationDetails;
import com.tangledcode.lang8.client.service.UserService;
import com.tangledcode.lang8.client.service.UserServiceAsync;

public class RegistrationPresenterImp extends BasePresenter<Display> implements RegistrationPresenter {
    
    private final UserServiceAsync service = GWT.create(UserService.class);

    @Inject
    public RegistrationPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }

    @Override
    public void bind() {
        super.bind();

        this.display.getResetClickHandlers().addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                eventBus.fireEvent(new ResetRegistrationEvent());
            }
        });

        this.display.getRegistrationClickHandlers().addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                String username = display.getUsernameText().getText();
                String email = display.getEmailText().getText();
                String password = display.getPasswordText().getText();
                String passwordConfirmation = display.getPasswordConfirmationText().getText();

                eventBus.fireEvent(new UserRegistrationEvent(new UserRegistrationDetailsImpl(username, email, password, passwordConfirmation)));
            }
        });
        
        this.display.getUsernameFocus().addBlurHandler(new BlurHandler() {
            
            public void onBlur(BlurEvent event) {
                doCheckUsername(((TextBox)event.getSource()).getText());
            }
        });

        this.display.onShow();
    }

    protected void doCheckUsername(String username) {
        service.checkUsername(username, new AsyncCallback<Boolean>() {
            
            public void onSuccess(Boolean responce) {
                if(responce) {
                    display.usernameValid();
                } else {
                    display.usernameInvalid();
                }
            }
            
            public void onFailure(Throwable exception) {
                display.usernameInvalid();
            }
        });
        
    }

    class UserRegistrationDetailsImpl implements UserRegistrationDetails {

        private String username;
        private String email;
        private String password;
        private String passwordConfirmation;

        public UserRegistrationDetailsImpl(String username, String email, String password, String passwordConfirmation) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.passwordConfirmation = passwordConfirmation;
        }

        public String getUsername() {
            return this.username;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPassword() {
            return this.password;
        }

        public String getPasswordConfirmation() {
            return this.passwordConfirmation;
        }

    }

}
