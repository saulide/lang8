package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

public interface ProfilePresenter extends Presenter<ProfilePresenter.Display> {

    public interface Display extends org.enunes.gwt.mvp.client.view.Display {

        void setUsername(String username);

        void setEmail(String email);
    }
    
}
