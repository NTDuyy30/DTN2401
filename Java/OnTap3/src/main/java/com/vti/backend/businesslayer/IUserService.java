package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.entiy.User;

public interface IUserService {
	boolean login(String email, String password) throws ClassNotFoundException, SQLException;

	boolean isEmailExists(String email) throws ClassNotFoundException, SQLException;

	boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException;

	void logout();

	List<User> getAllUser() throws ClassNotFoundException, SQLException;

	User getUserById(int userId) throws SQLException, ClassNotFoundException;

	boolean deleteUserById(int userId) throws SQLException, ClassNotFoundException;
}
