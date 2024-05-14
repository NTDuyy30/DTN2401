package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Employee;
import com.vti.entiy.Manager;

public interface IUserRepository {
//	Check project id exists
	boolean isProjectIdExists(int projectId) throws ClassNotFoundException, SQLException;

//	Get all employee by projectId
	List<Employee> getAllEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException;

//	Get all manager by projectId
	List<Manager> getAllManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException;

//	Login into Manager
	boolean login(String email, String password) throws ClassNotFoundException, SQLException;
}
