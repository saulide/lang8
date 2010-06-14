package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;
import com.tangledcode.lang8.client.model.Group;

public interface GroupPresenter extends Presenter<GroupPresenter.Display> {

    interface Display extends org.enunes.gwt.mvp.client.view.Display {

    	HasClickHandlers getNewGroupButtonClickHandlers();
    	
    	HasText getNewGroupTitle();
    	
    	HasText getNewGroupDescribtion();
    	
    	void setGroupTitle_1(String groupTitle);
    	void setGroupdescribtion_1(String groupDescribtion);
    	void setGroupUser_1(String groupUser);
    	
    	void setGroupTitle_2(String groupTitle);
    	void setGroupdescribtion_2(String groupDescribtion);
    	void setGroupUser_2(String groupUser);
    	
    	void setGroupTitle_3(String groupTitle);
    	void setGroupdescribtion_3(String groupDescribtion);
    	void setGroupUser_3(String groupUser);
        
    }
    
    void setGroup_1(Group group);
    void setGroup_2(Group group);
    void setGroup_3(Group group);
    
    //void setAllGroups(Group[] groups);

}
