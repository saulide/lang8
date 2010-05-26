package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.event.ResetRegistrationEvent;
import com.tangledcode.lang8.client.event.UserRegistrationEvent;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.presenter.RegistrationPresenter.Display;

public class RegistrationPresenterImp extends BasePresenter<Display> implements RegistrationPresenter {

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
                
                User user = new User(username, email, password);//, passwordConfirmation);
                
                eventBus.fireEvent(new UserRegistrationEvent(user));
            }
        });
    }

}
