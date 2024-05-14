package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entiy.Employee;
import com.vti.entiy.Manager;

public class UserController {
	private IUserService accSer;

	public UserController() throws FileNotFoundException, IOException {
		accSer = new UserService();
	}

//	Check project id exists
	public boolean isProjectIdExists(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.isProjectIdExists(projectId);
	}

//	Login
	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return accSer.login(username, password);
	}

//	Logout
	public void logout() {
		accSer.logout();
	}

//	Get all employee by projectId
	public List<Employee> getAllEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.getAllEmployeeByProjectId(projectId);
	}

//	Get all manager by projectId
	public List<Manager> getAllManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.getAllManagerByProjectId(projectId);
	}

}
