package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Account;

public interface IAccountService {
//	Login
	boolean login(String username, String password) throws SQLException, ClassNotFoundException;

//	Register
	boolean register(Account account) throws SQLException, ClassNotFoundException;

//	Logout
	void logout();

//	Check username exists
	boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException;

//	Get list accounts
	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

//	Get Account by ussername
	Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException;
}
