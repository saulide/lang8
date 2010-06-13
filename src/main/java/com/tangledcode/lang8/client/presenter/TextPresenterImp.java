package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RichTextArea.ExtendedFormatter;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.dto.LanguagesDTO;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display;

public class TextPresenterImp extends BasePresenter<Display> implements TextPresenter{
	
	@Inject
    public TextPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }
    
    @Override
	public void bind() {
		super.bind();
		
	}
    

	public void setText(List<LanguagesDTO> lang) {
		for(int i = 0; i< lang.size(); i++){
			this.display.setLangItems(lang.get(i).getTitle());
		}		
	}
 
 

}
