package com.vti.backend.businesslayer;

import java.sql.SQLException;

public interface IUserService {
//	Method register a account
	public boolean registerUser(String username, String password) throws SQLException;

//	Method login
	public boolean login(String username, String password) throws SQLException;
}
