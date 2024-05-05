package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Account;
import com.vti.entiy.Account.Category;
import com.vti.entiy.Manager;
import com.vti.entiy.Project;
import com.vti.utils.JDBCUtils;

public class AccountRepository implements IAccountRepository {
	private JDBCUtils jdbcUtils;

	public AccountRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	@Override
	public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `account` where email = ? and password = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, email);
		pstm.setString(2, password);

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

	@Override
	public boolean isProjectIDExists(int projectId) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `account` where project_id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, projectId);

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

	@Override
	public List<Account> getAccountByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		List<Account> accounts = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT * FROM `account` WHERE project_id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, projectId);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("id"), resultSet.getString("fullname"),
					resultSet.getString("email"), resultSet.getString("password"),
					resultSet.getString("category").equals("MANAGER") ? Category.MANAGER : Category.EMPLOYEE,
					getProjectById(resultSet.getInt("project_id")));
			accounts.add(account);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return accounts;
	}

	@Override
	public Project getProjectById(int project_id) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `project` where id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, project_id);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			Project project = new Project(project_id, resultSet.getString("project_name"),
					resultSet.getShort("team_size"));

			// disconnect
			jdbcUtils.closeConnection();
			return project;
		} else {
			jdbcUtils.closeConnection();
			return null;
		}
	}

	@Override
	public List<Manager> getManagerOfProject(int projectId) throws ClassNotFoundException, SQLException {
		List<Manager> managers = new ArrayList<>();

		// Create sql statement
		String sql = "select * from account where project_id = ? and category = 'MANAGER'";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, projectId);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		while (resultSet.next()) {
			Manager manager = new Manager(resultSet.getInt("id"), resultSet.getString("fullname"),
					resultSet.getString("email"), resultSet.getString("password"), Category.MANAGER,
					getProjectById(resultSet.getInt("project_id")), resultSet.getByte("exp_in_year"));
			managers.add(manager);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return managers;
	}

}
