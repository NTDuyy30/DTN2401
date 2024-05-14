package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entiy.Account;

public class AccountController {
//	Properties
	private IAccountService accountService;

//	Constructor
	public AccountController() throws FileNotFoundException, IOException {
		accountService = new AccountService();
	}

//	Login
	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return accountService.login(username, password);
	}

//	Register
	public boolean register(Account account) throws SQLException, ClassNotFoundException {
		return accountService.register(account);
	}

//	Logout
	public void logout() {
		accountService.logout();
	}

//	Check username exists
	public boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException {
		return accountService.isUsernameExists(username);
	}

//	Get list accounts
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		return accountService.getListAccounts();
	}

//	Get Account by ussername
	public Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException {
		return accountService.getAccountByUsername(username);
	}
}
