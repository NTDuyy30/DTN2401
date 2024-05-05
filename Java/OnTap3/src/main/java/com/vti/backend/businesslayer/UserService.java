package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entiy.Employee;
import com.vti.entiy.User;

public class UserService implements IUserService {
	private IUserRepository accRepo;
	public static boolean ISLOGIN = false;

	public UserService() throws FileNotFoundException, IOException {
		accRepo = new UserRepository();
	}

	@Override
	public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
		if (accRepo.login(email, password)) {
			ISLOGIN = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		return accRepo.isEmailExists(email);
	}

	@Override
	public void logout() {
		ISLOGIN = false;
	}

	@Override
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		return accRepo.getAllUser();
	}

	@Override
	public User getUserById(int userId) throws SQLException, ClassNotFoundException {
		return accRepo.getUserById(userId);
	}

	@Override
	public boolean deleteUserById(int userId) throws SQLException, ClassNotFoundException {
		return accRepo.deleteUserById(userId);
	}

	@Override
	public boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		return accRepo.createEmployee(employee);
	}

}
