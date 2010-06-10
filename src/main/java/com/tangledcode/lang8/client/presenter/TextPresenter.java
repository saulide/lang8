package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RichTextArea;

public interface TextPresenter extends Presenter<TextPresenter.Display>{

	public interface Display extends org.enunes.gwt.mvp.client.view.Display{
			
		HasHTML getEnteredText();
	}
 
}
