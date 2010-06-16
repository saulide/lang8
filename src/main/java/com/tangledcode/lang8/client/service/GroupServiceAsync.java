package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tangledcode.lang8.client.dto.GroupDTO;

public interface GroupServiceAsync {

    void saveGroup(GroupDTO group, AsyncCallback<Integer> callback);

    void getGroup(int id, AsyncCallback<GroupDTO> callback);

	void getMaxId(AsyncCallback<Integer> callback);

}
