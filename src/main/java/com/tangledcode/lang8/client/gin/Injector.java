package com.tangledcode.lang8.client.gin;

import org.enunes.gwt.mvp.client.EventBus;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.tangledcode.lang8.client.presenter.MainPresenter;

@GinModules(Module.class)
public interface Injector extends Ginjector {

    MainPresenter getMainPresenter();

    EventBus getEventBus();

}
