package com.vti.backend.presentationlayer;

import java.sql.SQLException;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;

public class UserController {
	private IUserService usService;

	public UserController() {
		usService = new UserService();
	}

	public boolean registerUser(String username, String password) throws SQLException {
		return usService.registerUser(username, password);
	}

	public boolean login(String username, String password) throws SQLException {
		return usService.login(username, password);
	}
}
