package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.tangledcode.lang8.client.dto.LanguagesDTO;

public interface TextPresenter extends Presenter<TextPresenter.Display>{

	public interface Display extends org.enunes.gwt.mvp.client.view.Display{
			
		HasHTML getEnteredText();
		
		HasText getTitleText();
		HasText getDescriptionText();
		ListBox getSelectedLanguage();
		
		void setLangItems(String item);
		
		
	}
	void setText(List<LanguagesDTO> lang);
 
}
