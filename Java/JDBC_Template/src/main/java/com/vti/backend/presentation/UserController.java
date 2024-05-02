package com.vti.backend.presentation;

import com.vti.backend.business.IUserService;
import com.vti.backend.business.UserService;

public class UserController {
	private IUserService usSer;

	public UserController() {
		usSer = new UserService();
	}

	public boolean registerUser(String username, String password) {
		return usSer.registerUser(username, password);
	}
}
