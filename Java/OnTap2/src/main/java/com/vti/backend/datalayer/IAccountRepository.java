package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Account;
import com.vti.entiy.Manager;
import com.vti.entiy.Project;

public interface IAccountRepository {
	boolean login(String email, String password) throws ClassNotFoundException, SQLException;

	boolean isProjectIDExists(int projectId) throws ClassNotFoundException, SQLException;

	List<Account> getAccountByProjectId(int projectId) throws ClassNotFoundException, SQLException;

	List<Manager> getManagerOfProject(int projectId) throws ClassNotFoundException, SQLException;

	Project getProjectById(int project_id) throws ClassNotFoundException, SQLException;
}
