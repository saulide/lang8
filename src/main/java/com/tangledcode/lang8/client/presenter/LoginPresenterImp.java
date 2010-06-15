package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.event.UserLoginEvent;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.presenter.LoginPresenter.Display;


public class LoginPresenterImp extends BasePresenter<Display> implements LoginPresenter {

    @Inject
    public LoginPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }

    public void bind() {
        super.bind();
        
        this.display.getLoginClickHandlers().addClickHandler(new ClickHandler() {
            
            public void onClick(ClickEvent event) {
                doSendForm();
            }
        });
        
        KeyPressHandler handler = new KeyPressHandler() {
            
            public void onKeyPress(KeyPressEvent event) {
                if(event.getCharCode() == KeyCodes.KEY_ENTER) {
                    doSendForm();
                }
            }
        };
        
        this.display.getUsernameKeyPressHandlers().addKeyPressHandler(handler);
        this.display.getPasswordKeyPressHandlers().addKeyPressHandler(handler);
        
        this.display.onShow();
    }

    protected void doSendForm() {
        String username = this.display.getUsernameText().getText();
        String password = this.display.getPasswordText().getText();
        
        if(username.equals("") || password.equals("")) {
            return;
        }
        
        User user = new User(username, password);
        
        this.eventBus.fireEvent(new UserLoginEvent(user));
    } 

}
