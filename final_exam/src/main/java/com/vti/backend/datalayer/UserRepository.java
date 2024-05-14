package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.entiy.Employee.ProSkill;
import com.vti.entiy.Manager;
import com.vti.entiy.User.Role;
import com.vti.utils.JDBCUtils;

public class UserRepository implements IUserRepository {
	private JDBCUtils jdbcUtils;

	public UserRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

//	Login into Manager
	@Override
	public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `users` where email = ? and password = ? and role='MANAGER'";

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

//	Check project id exists
	@Override
	public boolean isProjectIdExists(int projectId) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `users` where project_id = ?";

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

//	Get all employee by projectId
	@Override
	public List<Employee> getAllEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		List<Employee> emps = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT * FROM `users` where project_id = ? and role = 'EMPLOYEE'";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, projectId);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		
		// Handling result set
		while (resultSet.next()) {
			ProSkill pk;
			if (resultSet.getString("pro_skill").equals(ProSkill.DEV)) {
				pk = ProSkill.DEV;
			} else if (resultSet.getString("pro_skill").equals(ProSkill.JAVA)) {
				pk = ProSkill.JAVA;
			} else if (resultSet.getString("pro_skill").equals(ProSkill.SQL)) {
				pk = ProSkill.SQL;
			} else {
				pk = ProSkill.TEST;
			}
			Employee emp = new Employee(resultSet.getInt("id"), resultSet.getString("fullname"), 
					resultSet.getString("email"), Role.EMPLOYEE, pk, projectId);
			emps.add(emp);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return emps;
	}

//	Get all manager by projectId
	@Override
	public List<Manager> getAllManagerByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		List<Manager> mngs = new ArrayList<>();
		
		// Create sql statement
		String sql = "SELECT * FROM `users` where project_id = ? and role = 'MANAGER'";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, projectId);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();
		
		// Handling result set
		while (resultSet.next()) {
			Manager mng = new Manager(resultSet.getInt("id"), resultSet.getString("fullname"), 
					resultSet.getString("email"), Role.MANAGER, resultSet.getByte("exp_in_year"), projectId);
			mngs.add(mng);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return mngs;
	}

}
