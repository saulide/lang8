package com.tangledcode.lang8.client.presenter;

import java.util.List;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.dto.TextDTO;
import com.tangledcode.lang8.client.event.TextSearchEvent;
import com.tangledcode.lang8.client.model.Text;
import com.tangledcode.lang8.client.presenter.TextSearchPresenter.Display;

public class TextSearchPresenterImp extends BasePresenter<Display> implements TextSearchPresenter {

	@Inject
    public TextSearchPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }
    
    @Override
	public void bind() {
		super.bind();
		this.display.getSubmitBtnClickHandlers().addClickHandler(new ClickHandler() {		
			public void onClick(ClickEvent arg0) {
				doTextSearch();
				
			}
		});
		
	}

	protected void doTextSearch() {
		String text = this.display.getSearchItem().getText();
		String value = this.display.getSelectedSearchValue().getValue(this.display.getSelectedSearchValue().getSelectedIndex());
		eventBus.fireEvent(new TextSearchEvent(text, value));
		
	}

	public void setSearchItems(List<String> items) {
		for(int i = 0; i< items.size(); i++){
			this.display.setSearchPrefs(items.get(i));
		}
		
	}

	public void setResultLabel(String string) {
		this.display.setResultLabel(string);
		
	}

	public void setResultTitle(String string) {
		this.display.setResultTitle(string);
		
	}

	public void setResultLabel(List<Text> arg0) {
		//int i = arg0.size();
		this.display.setResultLabel(arg0.get(0).getTitle());
		this.display.setResultTitle(arg0.get(0).getDescription());
		
	}

}
