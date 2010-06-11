package com.tangledcode.lang8.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tangledcode.lang8.client.presenter.MenuPresenter.Display;

public class MenuWidget extends Composite implements Display {

    private static MenuWidgetUiBinder uiBinder = GWT.create(MenuWidgetUiBinder.class);

    @UiTemplate("ui/MenuWidget.ui.xml")
    interface MenuWidgetUiBinder extends UiBinder<Widget, MenuWidget> {
    }

    @UiField Button registrationButton;
    @UiField Button groupButton;
    @UiField Button loginButton;
    @UiField Button profileButton;
    @UiField Button textButton;

    public MenuWidget() {
        initWidget(uiBinder.createAndBindUi(this));
        
        this.loggedOut();
    }

    public Widget asWidget() {
        return this;
    }

    public HasClickHandlers getGroupClickHandlers() {
        return this.groupButton;
    }

    public HasClickHandlers getLoginClickHandlers() {
        return this.loginButton;
    }

    public HasClickHandlers getProfileClickHandlers() {
        return this.profileButton;
    }

    public HasClickHandlers getRegistrationClickHandlers() {
        return this.registrationButton;
    }

    public HasClickHandlers getTextClickHandlers() {
        return this.textButton;
    }

    public void loggedIn() {
        this.loginButton.setVisible(false);
        this.registrationButton.setVisible(false);
        this.groupButton.setVisible(true);
        this.profileButton.setVisible(true);
        this.textButton.setVisible(true);
    }

    public void loggedOut() {
        this.loginButton.setVisible(true);
        this.registrationButton.setVisible(true);
        this.groupButton.setVisible(false);
        this.profileButton.setVisible(false);
        this.textButton.setVisible(false);
    }

}
