package com.vti.backend.datalayer;

import java.sql.SQLException;

public interface IUserRepository {
//	Method insert a new user
	public boolean insertUser(String username, String password) throws SQLException;

//	Method check username and password
	public boolean checkExists(String username, String password) throws SQLException;
}
