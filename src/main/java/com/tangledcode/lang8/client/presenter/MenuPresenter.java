package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;

public interface MenuPresenter extends Presenter<MenuPresenter.Display> {

    public interface Display extends org.enunes.gwt.mvp.client.view.Display {
        
        HasClickHandlers getLogoutClickHandlers();

        HasClickHandlers getLoginClickHandlers();

        HasClickHandlers getRegistrationClickHandlers();

        HasClickHandlers getProfileClickHandlers();

        HasClickHandlers getGroupClickHandlers();

        HasClickHandlers getTextClickHandlers();
        
        HasClickHandlers getTextSearchClickHandlers();
        
        void loggedIn();
        
        void loggedOut();
        
    }

}
