package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Group;
import com.vti.utils.JDBCUtils;

public class GroupRepository implements IGroupRepository {
	private JDBCUtils jdbcUtils;

	public GroupRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		List<Group> groups = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT group_id, group_name FROM `Groups`";

		// execute query
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

	@Override
	public boolean createGroup(Group group) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "insert into `groups`(group_id, group_name) values(?, ?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, group.getGroupId());
		pstm.setString(2, group.getGroupName());

		// Handling result set
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

}
