package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.tangledcode.lang8.client.model.User;

public interface ProfilePresenter extends Presenter<ProfilePresenter.Display> {

    public interface Display extends org.enunes.gwt.mvp.client.view.Display {

        void setUsername(String username);

        void setEmail(String email);
    }
    
    void setUser(User user);
    
}
