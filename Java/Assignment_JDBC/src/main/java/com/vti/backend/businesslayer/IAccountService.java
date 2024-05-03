package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Account;

public interface IAccountService {
	boolean login(String username, String password) throws SQLException, ClassNotFoundException;

	boolean register(Account account) throws SQLException, ClassNotFoundException;

	void logout();

	boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException;

	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException;
}
