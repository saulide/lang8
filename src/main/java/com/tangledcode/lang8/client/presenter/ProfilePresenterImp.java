package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.inject.Inject;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.presenter.ProfilePresenter.Display;


public class ProfilePresenterImp extends BasePresenter<Display> implements ProfilePresenter {

    @Inject
    public ProfilePresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }

    public void bind() {
        super.bind();
    }

    public void setUser(User user) {
        this.display.setUsername(user.getUsername());
        this.display.setEmail(user.getEmail());
    }

}
