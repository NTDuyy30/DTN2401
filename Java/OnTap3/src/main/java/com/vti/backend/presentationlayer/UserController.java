package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entiy.Employee;
import com.vti.entiy.User;

public class UserController {
	private IUserService accSer;

	public UserController() throws FileNotFoundException, IOException {
		accSer = new UserService();
	}

	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		return accSer.isEmailExists(email);
	}

	public boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		return accSer.createEmployee(employee);
	}

	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return accSer.login(username, password);
	}

	public void logout() {
		accSer.logout();
	}

	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		return accSer.getAllUser();
	}

	public User getUserById(int userId) throws SQLException, ClassNotFoundException {
		return accSer.getUserById(userId);
	}

	public boolean deleteUserById(int userId) throws SQLException, ClassNotFoundException {
		return accSer.deleteUserById(userId);
	}
}
