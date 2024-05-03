package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IAccountService;
import com.vti.backend.businesslayer.impl.AccountService;
import com.vti.entiy.Account;

public class AccountController {
	private IAccountService accountService;

	public AccountController() throws FileNotFoundException, IOException {
		accountService = new AccountService();
	}

	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return accountService.login(username, password);
	}

	public boolean register(Account account) throws SQLException, ClassNotFoundException {
		return accountService.register(account);
	}

	public void logout() {
		accountService.logout();
	}

	public boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException {
		return accountService.isUsernameExists(username);
	}

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		return accountService.getListAccounts();
	}

	public Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException {
		return accountService.getAccountByUsername(username);
	}
}
