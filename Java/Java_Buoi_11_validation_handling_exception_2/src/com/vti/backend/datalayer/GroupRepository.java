package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Group;
import com.vti.utils.JDBCUtils;

public class GroupRepository implements IGroupRepository {
//	Properties
	private JDBCUtils jdbcUtils;

//	Constructor
	public GroupRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

//	Get list group
	@Override
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		List<Group> groups = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT group_id, group_name FROM `Groups`";

		// Execute query
		ResultSet resultSet = jdbcUtils.executeQuery(sql);

		// Handling result set
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("group_id"), resultSet.getString("group_name"));
			groups.add(group);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return groups;
	}

//	Create a new group
	@Override
	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "insert into `groups`(group_name) values(?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, group.getGroupName());

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

//	Check group Name exists
	@Override
	public boolean isGroupExists(String name) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `groups` where group_name = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, name);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.closeConnection();
			return true;
		} else {
			jdbcUtils.closeConnection();
			return false;
		}
	}

//	Update group by id
	@Override
	public boolean updateGroupById(Group group, int id) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "update `groups` set group_name = ? where group_id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, group.getGroupName());
		pstm.setInt(2, id);

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

//	Check group id exists
	@Override
	public boolean isGroupIdExists(int id) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `groups` where group_id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, id);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.closeConnection();
			return true;
		} else {
			jdbcUtils.closeConnection();
			return false;
		}
	}

//	Delete group by id
	@Override
	public boolean deleteGroupById(int id) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "delete from `groups` where group_id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, id);

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

//	Update group by id with Procedure
	@Override
	public boolean updateGroupByIdWithProcedure(Group group, int id) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "{CALL sp_update_groups(?, ?)}";

		// Create callable statement
		CallableStatement cstm = jdbcUtils.createCallableStatement(sql);
		cstm.setString(1, group.getGroupName());
		cstm.setInt(2, id);

		// Execute query
		int rs = cstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

}
