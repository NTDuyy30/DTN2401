package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.backend.datalayer.IGroupRepository;
import com.vti.entiy.Group;

public class GroupService implements IGroupService {

	private IGroupRepository groupRepository;

	public GroupService() throws FileNotFoundException, IOException {
		groupRepository = new GroupRepository();
	}

	@Override
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return groupRepository.getListGroups();
	}

	@Override
	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		return groupRepository.createGroup(group);
	}

	@Override
	public boolean isGroupExists(String name) throws ClassNotFoundException, SQLException {
		return groupRepository.isGroupExists(name);
	}

	@Override
	public boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupRepository.updateGroupById(group, id);
	}

	@Override
	public boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException {
		return groupRepository.isGroupIdExists(id);
	}

	@Override
	public boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException {
		return groupRepository.deleteGroupById(id);
	}

	@Override
	public boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException {
		return groupRepository.updateGroupByIdWithProcedure(group, id);
	}

}
