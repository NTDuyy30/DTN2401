package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Account;
import com.vti.entiy.Manager;

public interface IAccountService {
	boolean login(String email, String password) throws ClassNotFoundException, SQLException;

	boolean isProjectIDExists(int projectId) throws ClassNotFoundException, SQLException;

	void logout();

	List<Account> getAccountByProjectId(int projectId) throws ClassNotFoundException, SQLException;

	List<Manager> getManagerOfProject(int projectId) throws ClassNotFoundException, SQLException;
}
