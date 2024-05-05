package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entiy.Account;
import com.vti.utils.DateUtils;
import com.vti.utils.ScannerUtils;

public class AccountFunction {
	public static void login() {
		try {
			AccountController con = new AccountController();
			String username = ScannerUtils.inputString("Input username: ");
			String passwrod = ScannerUtils.inputPassword();
			if (con.login(username, passwrod)) {
				System.out.println("Login successful!");
			} else {
				System.out.println("Login fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void register() {
		try {
			AccountController con = new AccountController();
			String username = null;
			while (true) {
				username = ScannerUtils.inputName("Input username: ");
				if (con.isUsernameExists(username)) {
					System.out.println("Please enter username again because it already exists: ");
				} else {
					break;
				}
			}
			String passwrod = ScannerUtils.inputPassword();
			String fullname = ScannerUtils.inputName("Input fullname: ");
			String email = ScannerUtils.inputEmail();
			String phoneNumber = ScannerUtils.inputPhoneNumber();
			Account account = new Account(username, passwrod, fullname, email, phoneNumber);

			if (con.register(account)) {
				System.out.println("Register successful!");
			} else {
				System.out.println("Register fail!");
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

	public static void getListAccounts() {
		try {
			AccountController accountCon = new AccountController();
			List<Account> listAccount = accountCon.getListAccounts();

			System.out.println(
					"=================================================List Account====================================================");
			String leftAlignFormat = "|  %-8s  |  %-8s  |  %-18s  |  %-17s  |  %-12s  |  %-11s  |%n";
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");
			System.out.format(
					"|  username  |  password  |       fullname       |        email        |  phone number  |      create time      |%n");
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");

			for (Account a : listAccount) {
				System.out.format(leftAlignFormat, a.getUsername(), a.getPassword(), a.getFullname(), a.getEmail(),
						a.getPhoneNumber(), DateUtils.getddMMyyyyHHmmss(a.getCreateTime()));
			}
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getAccountByUsername() {
		try {
			AccountController accountCon = new AccountController();
			String username = null;

			while (true) {
				username = ScannerUtils.inputName("Input username: ");
				if (!accountCon.isUsernameExists(username)) {
					System.out.println("Please enter username again because it not exists: ");
				} else {
					break;
				}
			}

			Account a = accountCon.getAccountByUsername(username);
			System.out.println(
					"===============================================Account Information=================================================");
			String leftAlignFormat = "|  %-8s  |  %-8s  |  %-18s  |  %-17s  |  %-12s  |  %-11s  |%n";
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");
			System.out.format(
					"|  username  |  password  |       fullname       |        email        |  phone number  |      create time      |%n");
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");

			System.out.format(leftAlignFormat, a.getUsername(), a.getPassword(), a.getFullname(), a.getEmail(),
					a.getPhoneNumber(), DateUtils.getddMMyyyyHHmmss(a.getCreateTime()));
			System.out.format(
					"+------------+--------------------------------------------------------------------------------------------------+%n");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
