package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;

public interface RegistrationPresenter extends Presenter<RegistrationPresenter.Display> {

    public interface Display extends org.enunes.gwt.mvp.client.view.Display {

        HasClickHandlers getResetClickHandlers();

        HasClickHandlers getRegistrationClickHandlers();

        HasText getUsernameText();

        HasText getPasswordText();

        HasText getPasswordConfirmationText();

        HasText getEmailText();
        
    }

}
