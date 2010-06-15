package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.tangledcode.lang8.client.CurrentUser;
import com.tangledcode.lang8.client.event.NewGroupEvent;
import com.tangledcode.lang8.client.model.Group;
import com.tangledcode.lang8.client.presenter.GroupPresenter.Display;


public class GroupPresenterImp extends BasePresenter<Display> implements GroupPresenter {

    @Inject
    public GroupPresenterImp(EventBus eventBus, Display display) {
        super(eventBus, display);
    }

    public void bind() {
        super.bind();
        
        this.display.getNewGroupButtonClickHandlers().addClickHandler(new ClickHandler() {
            
            public void onClick(ClickEvent event) {
                String title = display.getNewGroupTitle().getText();
                String describtion = display.getNewGroupDescribtion().getText();
                
                Group group = new Group(title, describtion, CurrentUser.getUser());
                
                eventBus.fireEvent(new NewGroupEvent(group));
            }
        });
    } 
    
    public void setGroup_1(Group group) {
        this.display.setGroupTitle_1(group.getTitle());
        this.display.setGroupdescribtion_1(group.getDescribtion());
        this.display.setGroupUser_1(group.getUserName());
    }
    
    public void setGroup_2(Group group) {
        this.display.setGroupTitle_2(group.getTitle());
        this.display.setGroupdescribtion_2(group.getDescribtion());
        this.display.setGroupUser_2(group.getUserIdToString());
    }
    
    public void setGroup_3(Group group) {
        this.display.setGroupTitle_3(group.getTitle());
        this.display.setGroupdescribtion_3(group.getDescribtion());
        this.display.setGroupUser_3(group.getUserIdToString());
    }

}
