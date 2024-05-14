package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.backend.businesslayer.IGroupService;
import com.vti.entiy.Group;

public class GroupController {
//	Properties
	private IGroupService groupService;

//	Constructor
	public GroupController() throws FileNotFoundException, IOException {
		groupService = new GroupService();
	}

//	Get list group
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return groupService.getListGroups();
	}

//	Create a new group
	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		return groupService.createGroup(group);
	}

//	Check group Name exists
	public boolean isGroupExists(String name) throws ClassNotFoundException, SQLException {
		return groupService.isGroupExists(name);
	}

//	Update group by id
	public boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupService.updateGroupById(group, id);
	}

//	Check group id exists
	public boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException {
		return groupService.isGroupIdExists(id);
	}

//	Delete group by id
	public boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException {
		return groupService.deleteGroupById(id);
	}

//	Update group by id with Procedure
	public boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupService.updateGroupByIdWithProcedure(group, id);
	}
}
