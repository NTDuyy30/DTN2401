package com.vti.backend.business;

import com.vti.backend.data.IUserRepository;
import com.vti.backend.data.UserRepository;

public class UserService implements IUserService {
	private IUserRepository usRepo;

	public UserService() {
		usRepo = new UserRepository();
	}

	@Override
	public boolean registerUser(String username, String password) {
		return usRepo.insertUser(username, password);
	}

}
