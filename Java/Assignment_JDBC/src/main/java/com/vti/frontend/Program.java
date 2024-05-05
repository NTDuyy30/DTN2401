package com.vti.frontend;

import com.vti.backend.businesslayer.AccountService;
import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			if (!AccountService.ISLOGIN) {
				menu();
			} else {
				menuAfterLogin();
			}
			choice = ScannerUtils.inputInt();
			switch (choice) {
			case 1:
				if (!AccountService.ISLOGIN) {
					AccountFunction.login();
				} else {
					AccountFunction.logout();
				}
				break;
			case 2:
				if (!AccountService.ISLOGIN) {
					AccountFunction.register();
				} else {
					AccountFunction.getListAccounts();
				}
				break;
			case 3:
				if (!AccountService.ISLOGIN) {
					System.out.println("Bye bye");
					return;
				} else {
					AccountFunction.getAccountByUsername();
				}
				break;
			case 4:
				System.out.println("Bye bye");
				return;
			default:
				System.out.println("Please enter again in 1 - 5");
			}
		}
	}

	public static void menu() {
		System.out.println("\n===============================Manage Account===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Login");
		System.out.format(leftAlignFormat, "2. Register");
		System.out.format(leftAlignFormat, "3. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}

	public static void menuAfterLogin() {
		System.out.println("\n===============================Manage Account===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Logout");
		System.out.format(leftAlignFormat, "2. Danh sách tài khoản");
		System.out.format(leftAlignFormat, "3. Thông tin tài khoản");
		System.out.format(leftAlignFormat, "4. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
