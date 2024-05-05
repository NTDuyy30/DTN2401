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

	public boolean isGroupExists(String name) throws ClassNotFoundException, SQLException {
		return groupService.isGroupExists(name);
	}

	public boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupService.updateGroupById(group, id);
	}

	public boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException {
		return groupService.isGroupIdExists(id);
	}

	public boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException {
		return groupService.deleteGroupById(id);
	}

	public boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupService.updateGroupByIdWithProcedure(group, id);
	}
}
