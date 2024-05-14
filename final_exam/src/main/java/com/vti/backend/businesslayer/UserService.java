package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entiy.Employee;
import com.vti.entiy.Manager;

public class UserService implements IUserService {
	private IUserRepository accRepo;
	public static boolean ISLOGIN = false;

	public UserService() throws FileNotFoundException, IOException {
		accRepo = new UserRepository();
	}

//	Login
	@Override
	public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
		if (accRepo.login(email, password)) {
			ISLOGIN = true;
			return true;
		}
		return false;
	}

//	Check project id exists
	@Override
	public boolean isProjectIdExists(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.isProjectIdExists(projectId);
	}

//	Logout
	@Override
	public void logout() {
		ISLOGIN = false;
	}

//	Get all employee by projectId
	@Override
	public List<Employee> getAllEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.getAllEmployeeByProjectId(projectId);
	}

//	Get all manager by projectId
	@Override
	public List<Manager> getAllManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.getAllManagerByProjectId(projectId);
	}

}
