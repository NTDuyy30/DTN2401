package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entiy.Account;
import com.vti.entiy.Manager;
import com.vti.utils.ScannerUtils;

public class AccountFunction {
	public static void login() {
		try {
			AccountController con = new AccountController();
			String email = ScannerUtils.inputEmail();
			String passwrod = ScannerUtils.inputPassword();
			if (con.login(email, passwrod)) {
				System.out.println("Login successful!");
			} else {
				System.out.println("Login fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			AccountController con = new AccountController();
			con.logout();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getAccountByProjectId() {
		AccountController con;
		try {
			con = new AccountController();
			int projectId = -1;
			while (true) {
				projectId = ScannerUtils.inputId("Input project id: ");
				if (!con.isProjectIDExists(projectId)) {
					System.out.println("Please enter projectId again because it not exists: ");
				} else {
					break;
				}
			}
			List<Account> accounts = con.getAccountByProjectId(projectId);
			for (Account a : accounts) {
				System.out.println(a);
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getManagerOfProject() {
		AccountController con;
		try {
			con = new AccountController();
			int projectId = -1;
			while (true) {
				projectId = ScannerUtils.inputId("Input project id: ");
				if (!con.isProjectIDExists(projectId)) {
					System.out.println("Please enter projectId again because it not exists: ");
				} else {
					break;
				}
			}
			List<Manager> managers = con.getManagerOfProject(projectId);
			for (Manager m : managers) {
				System.out.println(m);
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
