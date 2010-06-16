package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.dto.LanguageDTO;
import com.tangledcode.lang8.client.event.TextSubmitEvent;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display;
import com.tangledcode.lang8.client.presenter.TextPresenter.Display.SubmitTextDetails;

public class TextPresenterImp extends BasePresenter<Display> implements TextPresenter{
	
	@Inject
    public TextPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }
    
    @Override
	public void bind() {
		super.bind();
		this.display.getSubmitClickHandlers().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent arg0) {
				doTextSubmit();
				//eventBus.fireEvent(new TextSubmitEvent());
				
			}
		});
		
	}
    

	protected void doTextSubmit() {
		String title = this.display.getTitleText().getText();
		String description = this.display.getDescriptionText().getText();
		// Hier kann dass problem liegen
		String language = this.display.getSelectedLanguage().getValue(this.display.getSelectedLanguage().getSelectedIndex());
		String content = this.display.getEnteredText().getText();
		eventBus.fireEvent(new TextSubmitEvent(new SubmitTextDetailsImp(title, language, content, description)));
		
	}

	public void setText(List<LanguageDTO> lang) {
		for(int i = 0; i< lang.size(); i++){
			this.display.setLangItems(lang.get(i).getTitle());
		}		
	}
	
	class SubmitTextDetailsImp implements SubmitTextDetails{
		
		private String title;
		private String language;
		private String content;
		private String description;
		
		public SubmitTextDetailsImp(String title, String language, String content, String description) {
			this.title = title;
			this.language = language;
			this.content = content;
			this.description = description;
		}
		

		public String getContent() {
			// TODO Auto-generated method stub
			return this.content;
		}

		public String getDescription() {
			// TODO Auto-generated method stub
			return this.description;
		}

		public String getLanguage() {
			// TODO Auto-generated method stub
			return this.language;
		}

		public String getTitle() {
			// TODO Auto-generated method stub
			return this.title;
		}
		
	}
 
 

}
