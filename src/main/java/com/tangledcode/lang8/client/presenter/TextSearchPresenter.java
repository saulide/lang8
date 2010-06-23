package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.tangledcode.lang8.client.dto.TextDTO;
import com.tangledcode.lang8.client.model.Text;

public interface TextSearchPresenter extends Presenter<TextSearchPresenter.Display>{
	
    interface Display extends org.enunes.gwt.mvp.client.view.Display {

    	HasText getSearchItem();
    	ListBox getSelectedSearchValue();
    	void setSearchPrefs(String item);
    	HasClickHandlers getSubmitBtnClickHandlers();
    	void setResultLabel(String label);
    	void setResultTitle(String resultTitle);
		void setResultText(String content);
		void showCommentEditor();
    }
    
    void setSearchItems(List<String> items);

	void setResultTitle(String string);

	void setResultLabel(List<Text> returnTexts);

}
