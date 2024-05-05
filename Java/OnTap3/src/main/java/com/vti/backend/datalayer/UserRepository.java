package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.entiy.User;
import com.vti.entiy.User.Role;
import com.vti.utils.JDBCUtils;

public class UserRepository implements IUserRepository {
	private JDBCUtils jdbcUtils;

	public UserRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	@Override
	public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `users` where email = ? and password = ?";

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
	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `users` where email = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, email);

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
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT * FROM `users`";

		// Execute query
		ResultSet resultSet = jdbcUtils.executeQuery(sql);

		// Handling result set
		while (resultSet.next()) {
			User user = new User(resultSet.getInt("id"), resultSet.getString("fullname"), resultSet.getString("email"));
			users.add(user);
		}

		// disconnect
		jdbcUtils.closeConnection();

		return users;
	}

	@Override
	public User getUserById(int userId) throws SQLException, ClassNotFoundException {
		// Create sql statement
		String sql = "select * from `users` where id = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, userId);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			User user = new User(resultSet.getInt("id"), resultSet.getString("fullname"), resultSet.getString("email"));
			// disconnect
			jdbcUtils.closeConnection();
			return user;
		} else {
			jdbcUtils.closeConnection();
			return null;
		}
	}

	@Override
	public boolean deleteUserById(int userId) throws SQLException, ClassNotFoundException {
//		Create sql
		String sql = "delete from users where id = ?";

//		create preparestatement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setInt(1, userId);

//		Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

	@Override
	public boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "insert into `users`(fullname, email, password, pro_skill, role) values(?, ?, ?, ?, ?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, employee.getFullname());
		pstm.setString(2, employee.getEmail());
		pstm.setString(3, "123456");
		pstm.setString(4, employee.getProSkill().name());
		pstm.setString(5, Role.EMPLOYEE.name());

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}
}
