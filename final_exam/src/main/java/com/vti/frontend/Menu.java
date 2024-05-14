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
				UserFunction.getAllEmployeeByProjectId();
				break;
			case 3:
				UserFunction.getAllManagerByProjectId();
				break;
			case 4:
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
			System.out.format(leftAlignFormat, "1. Login into Manager");
		} else {
			System.out.format(leftAlignFormat, "1. Logout");
		}
		System.out.format(leftAlignFormat, "2. Get All Employee by project id");
		System.out.format(leftAlignFormat, "3. Get All Manager by id");
		System.out.format(leftAlignFormat, "4. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
