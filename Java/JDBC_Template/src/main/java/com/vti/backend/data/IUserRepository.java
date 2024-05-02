package com.vti.backend.data;

public interface IUserRepository {
//	Method select all user
	public boolean selectAllUser();

//	Method insert user
	public boolean insertUser(String username, String password);
}
