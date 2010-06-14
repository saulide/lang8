package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.tangledcode.lang8.client.dto.LanguageDTO;

public interface TextPresenter extends Presenter<TextPresenter.Display>{

	public interface Display extends org.enunes.gwt.mvp.client.view.Display{
			
		HasHTML getEnteredText();
		
		HasText getTitleText();
		HasText getDescriptionText();
		ListBox getSelectedLanguage();
		HasClickHandlers getSubmitClickHandlers();
		
		void setLangItems(String item);
		
		public interface SubmitTextDetails {
			String getTitle();
			String getDescription();
			String getContent();
			String getLanguage();
		}
		
		
	}
	void setText(List<LanguageDTO> lang);
 
}
