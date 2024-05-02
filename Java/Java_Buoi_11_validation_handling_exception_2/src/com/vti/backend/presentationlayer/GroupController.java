package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.backend.businesslayer.IGroupService;
import com.vti.entiy.Group;

public class GroupController {

	private IGroupService groupService;

	public GroupController() throws FileNotFoundException, IOException {
		groupService = new GroupService();
	}

	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return groupService.getListGroups();
	}

	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		return groupService.createGroup(group);
	}
}
