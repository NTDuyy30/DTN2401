package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entiy.Account;
import com.vti.entiy.Manager;

public class AccountService implements IAccountService {
	private IAccountRepository accRepo;
	public static boolean ISLOGIN = false;

	public AccountService() throws FileNotFoundException, IOException {
		accRepo = new AccountRepository();
	}

	@Override
	public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
		if (accRepo.login(email, password)) {
			ISLOGIN = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean isProjectIDExists(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.isProjectIDExists(projectId);
	}

	@Override
	public void logout() {
		ISLOGIN = false;
	}

	@Override
	public List<Manager> getManagerOfProject(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.getManagerOfProject(projectId);
	}

	@Override
	public List<Account> getAccountByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return accRepo.getAccountByProjectId(projectId);
	}

}
