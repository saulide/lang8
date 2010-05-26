package com.tangledcode.lang8.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.tangledcode.lang8.client.gin.Injector;
import com.tangledcode.lang8.client.presenter.MainPresenter;

public class Application implements EntryPoint {

    private final Injector ginInjector = GWT.create(Injector.class);

    public void onModuleLoad() {
        DeferredCommand.addCommand(new Command() {

            public void execute() {
                final MainPresenter mainPresenter = ginInjector.getMainPresenter();

                mainPresenter.bind();

                RootLayoutPanel.get().add(mainPresenter.getDisplay().asWidget());
            }
        });
    }

}
