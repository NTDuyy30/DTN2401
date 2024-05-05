package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entiy.Account;
import com.vti.entiy.Manager;

public class AccountController {
	private IAccountService accSer;

	public AccountController() throws FileNotFoundException, IOException {
		accSer = new AccountService();
	}

	public boolean isProjectIDExists(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.isProjectIDExists(projectId);
	}

	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return accSer.login(username, password);
	}

	public void logout() {
		accSer.logout();
	}

	public List<Account> getAccountByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.getAccountByProjectId(projectId);
	}

	public List<Manager> getManagerOfProject(int projectId) throws ClassNotFoundException, SQLException {
		return accSer.getManagerOfProject(projectId);
	}

}
