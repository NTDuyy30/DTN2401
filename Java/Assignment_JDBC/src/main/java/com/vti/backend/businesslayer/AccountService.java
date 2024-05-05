package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entiy.Account;

public class AccountService implements IAccountService {
	private IAccountRepository accountRepository;
	public static boolean ISLOGIN = false;

	public AccountService() throws FileNotFoundException, IOException {
		accountRepository = new AccountRepository();
	}

	@Override
	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		if (accountRepository.login(username, password)) {
			ISLOGIN = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean register(Account account) throws SQLException, ClassNotFoundException {
		return accountRepository.register(account);
	}

	@Override
	public void logout() {
		ISLOGIN = false;
	}

	@Override
	public boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException {
		return accountRepository.isUsernameExists(username);
	}

	@Override
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		return accountRepository.getListAccounts();
	}

	@Override
	public Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException {
		return accountRepository.getAccountByUsername(username);
	}
}
