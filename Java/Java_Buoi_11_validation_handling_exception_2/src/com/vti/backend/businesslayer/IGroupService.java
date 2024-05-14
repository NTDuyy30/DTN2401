package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Group;

public interface IGroupService {
//	Get list group
	List<Group> getListGroups() throws ClassNotFoundException, SQLException;

//	Create a new group
	boolean createGroup(Group group) throws ClassNotFoundException, SQLException;

//	Check group Name exists
	boolean isGroupExists(String name) throws ClassNotFoundException, SQLException;

//	Update group by id
	boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException;

//	Check group id exists
	boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException;

//	Delete group by id
	boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException;

//	Update group by id with Procedure
	boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException;
}
