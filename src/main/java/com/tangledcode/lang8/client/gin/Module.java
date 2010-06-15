package com.tangledcode.lang8.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.tangledcode.lang8.client.presenter.GroupPresenter;
import com.tangledcode.lang8.client.presenter.GroupPresenterImp;
import com.tangledcode.lang8.client.presenter.LoginPresenter;
import com.tangledcode.lang8.client.presenter.LoginPresenterImp;
import com.tangledcode.lang8.client.presenter.MainPresenter;
import com.tangledcode.lang8.client.presenter.MainPresenterImp;
import com.tangledcode.lang8.client.presenter.MenuPresenter;
import com.tangledcode.lang8.client.presenter.MenuPresenterImp;
import com.tangledcode.lang8.client.presenter.ProfilePresenter;
import com.tangledcode.lang8.client.presenter.ProfilePresenterImp;
import com.tangledcode.lang8.client.presenter.RegistrationPresenter;
import com.tangledcode.lang8.client.presenter.RegistrationPresenterImp;
import com.tangledcode.lang8.client.presenter.TextPresenter;
import com.tangledcode.lang8.client.presenter.TextPresenterImp;
import com.tangledcode.lang8.client.presenter.TextSearchPresenter;
import com.tangledcode.lang8.client.presenter.TextSearchPresenterImp;
import com.tangledcode.lang8.client.widget.GroupWidget;
import com.tangledcode.lang8.client.widget.LoginWidget;
import com.tangledcode.lang8.client.widget.MainWidget;
import com.tangledcode.lang8.client.widget.MenuWidget;
import com.tangledcode.lang8.client.widget.ProfileWidget;
import com.tangledcode.lang8.client.widget.RegistrationWidget;
import com.tangledcode.lang8.client.widget.TextSearchWidget;
import com.tangledcode.lang8.client.widget.TextWidget;

public class Module extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new org.enunes.gwt.mvp.client.gin.Module());

        // mvp
         
        bind(TextPresenter.class).to(TextPresenterImp.class);
        bind(TextPresenter.Display.class).to(TextWidget.class);
        bind(TextSearchPresenter.class).to(TextSearchPresenterImp.class);
        bind(TextSearchPresenter.Display.class).to(TextSearchWidget.class);
        
        bind(MainPresenter.class).to(MainPresenterImp.class);
        bind(MainPresenter.Display.class).to(MainWidget.class);
        
        bind(MenuPresenter.class).to(MenuPresenterImp.class);
        bind(MenuPresenter.Display.class).to(MenuWidget.class);
        
        bind(RegistrationPresenter.class).to(RegistrationPresenterImp.class);
        bind(RegistrationPresenter.Display.class).to(RegistrationWidget.class);
        
        bind(LoginPresenter.class).to(LoginPresenterImp.class);
        bind(LoginPresenter.Display.class).to(LoginWidget.class);
        
        bind(ProfilePresenter.class).to(ProfilePresenterImp.class);
        bind(ProfilePresenter.Display.class).to(ProfileWidget.class);
        
        bind(GroupPresenter.class).to(GroupPresenterImp.class);
        bind(GroupPresenter.Display.class).to(GroupWidget.class);

    }    

}
