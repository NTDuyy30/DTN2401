package com.vti.backend.businesslayer;

import java.sql.SQLException;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;

public class UserService implements IUserService {
	private IUserRepository usRepository;

	public UserService() {
		usRepository = new UserRepository();
	}

	@Override
	public boolean registerUser(String username, String password) throws SQLException {
		return usRepository.insertUser(username, password);
	}

	@Override
	public boolean login(String username, String password) throws SQLException {
		return usRepository.checkExists(username, password);
	}
}
