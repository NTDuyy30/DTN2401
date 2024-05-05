package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Group;

public interface IGroupService {
	List<Group> getListGroups() throws ClassNotFoundException, SQLException;

	boolean createGroup(Group group) throws ClassNotFoundException, SQLException;

	boolean isGroupExists(String name) throws ClassNotFoundException, SQLException;

	boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException;

	boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException;

	boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException;

	boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException;
}
