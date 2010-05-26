package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
                String username = display.getUsernameText().getText();
                String password = display.getPasswordText().getText();
                
                User user = new User(username, password);
                
                eventBus.fireEvent(new UserLoginEvent(user));
            }
        });
    }

}
