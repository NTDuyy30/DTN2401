package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.backend.datalayer.IGroupRepository;
import com.vti.entiy.Group;

public class GroupService implements IGroupService {
//	Properties
	private IGroupRepository groupRepository;
	
//	Constructor
	public GroupService() throws FileNotFoundException, IOException {
		groupRepository = new GroupRepository();
	}

//	Get list group
	@Override
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return groupRepository.getListGroups();
	}

//	Create a new group
	@Override
	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		return groupRepository.createGroup(group);
	}

//	Check group Name exists
	@Override
	public boolean isGroupExists(String name) throws ClassNotFoundException, SQLException {
		return groupRepository.isGroupExists(name);
	}

//	Update group by id
	@Override
	public boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupRepository.updateGroupById(group, id);
	}

//	Check group id exists
	@Override
	public boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException {
		return groupRepository.isGroupIdExists(id);
	}

//	Delete group by id
	@Override
	public boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException {
		return groupRepository.deleteGroupById(id);
	}

//	Update group by id with Procedure
	@Override
	public boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupRepository.updateGroupByIdWithProcedure(group, id);
	}

}
