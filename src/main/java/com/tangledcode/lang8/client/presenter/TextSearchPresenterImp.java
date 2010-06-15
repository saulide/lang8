package com.tangledcode.lang8.client.presenter;


import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.inject.Inject;
import com.tangledcode.lang8.client.presenter.TextSearchPresenter.Display;

public class TextSearchPresenterImp extends BasePresenter<Display> implements TextSearchPresenter {

	@Inject
    public TextSearchPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }
    
    @Override
	public void bind() {
		super.bind();
		
	}

}
