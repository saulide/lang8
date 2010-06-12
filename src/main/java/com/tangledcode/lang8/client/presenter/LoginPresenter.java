package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;

public interface LoginPresenter extends Presenter<LoginPresenter.Display> {

    interface Display extends org.enunes.gwt.mvp.client.view.Display {

        HasText getUsernameText();

        HasText getPasswordText();

        HasClickHandlers getLoginClickHandlers();
        
        void onShow();
        
    }

}
