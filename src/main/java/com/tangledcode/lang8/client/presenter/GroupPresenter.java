package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;

public interface GroupPresenter extends Presenter<GroupPresenter.Display> {

    interface Display extends org.enunes.gwt.mvp.client.view.Display {

    	HasClickHandlers getNewGroupButtonClickHandlers();
    	
    	HasText getNewGroupTitle();
    	
    	HasText getNewGroupDescribtion();
        
    }

}
