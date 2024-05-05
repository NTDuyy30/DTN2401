package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.entiy.User;

public interface IUserRepository {
	boolean isEmailExists(String email) throws ClassNotFoundException, SQLException;

	boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException;

	List<User> getAllUser() throws ClassNotFoundException, SQLException;

	User getUserById(int userId) throws SQLException, ClassNotFoundException;

	boolean deleteUserById(int userId) throws SQLException, ClassNotFoundException;

	boolean login(String email, String password) throws ClassNotFoundException, SQLException;
}
