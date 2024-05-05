package com.vti.frontend;

import com.vti.backend.businesslayer.UserService;
import com.vti.utils.ScannerUtils;

public class Menu {
	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			menu();
			choice = ScannerUtils.inputInt();

			switch (choice) {
			case 1:
				if (!UserService.ISLOGIN) {
					UserFunction.login();
				} else {
					UserFunction.logout();
				}
				break;
			case 2:
				UserFunction.getAllUser();
				break;
			case 3:
				UserFunction.getUserById();
				break;
			case 4:
				UserFunction.deleteUserById();
				break;
			case 5:
				if (UserService.ISLOGIN) {
					UserFunction.createEmployee();
				} else {
					System.out.println("Bye bye");
				}
				break;
			case 6:
				System.out.println("Bye bye");
				return;
			default:
				System.out.println("Please enter again in menu");
			}
		}
	}

	public static void menu() {
		System.out.println("\n==================================Manage User===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		if (!UserService.ISLOGIN) {
			System.out.format(leftAlignFormat, "1. Login");
		} else {
			System.out.format(leftAlignFormat, "1. Logout");
		}
		System.out.format(leftAlignFormat, "2. Get all User");
		System.out.format(leftAlignFormat, "3. Get User by id");
		System.out.format(leftAlignFormat, "4. Delete User by id");
		if (UserService.ISLOGIN) {
			System.out.format(leftAlignFormat, "5. Add a new Employee");
		} else {
			System.out.format(leftAlignFormat, "5. Exit");
		}
		if (UserService.ISLOGIN) {
			System.out.printf(leftAlignFormat, "6. Exit");
		}
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
