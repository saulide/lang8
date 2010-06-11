package com.tangledcode.lang8.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tangledcode.lang8.client.dto.GroupDTO;

@RemoteServiceRelativePath("group")
public interface GroupService extends RemoteService {

    GroupDTO getGroup(int id);

    int saveGroup(GroupDTO group);

}
