package com.vti.fontend;

import java.sql.SQLException;

import com.vti.backend.presentationlayer.UserController;
import com.vti.backend.utils.ScannerUtils;

public class Progaram {
	public static boolean logged = false;

	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			menu();
			choice = ScannerUtils.inputInt("");
			UserController usController = new UserController();
			switch (choice) {
			case 1:
				System.out.println("Register account");
				System.out.print("\tEnter username: ");
				String username = ScannerUtils.inputString("You cannot leave it blank");
				System.out.print("\tEnter password: ");
				String password = ScannerUtils.inputString("You cannot leave it blank");

				try {
					if (usController.registerUser(username, password)) {
						System.out.println("Register successful");
					} else {
						System.out.println("Register fail");
					}
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Register fail");
				}
				break;
			case 2:
				if (logged == false) {
					System.out.println("Login");
					System.out.print("\tEnter username: ");
					String username1 = ScannerUtils.inputString("You cannot leave it blank");
					System.out.print("\tEnter password: ");
					String password1 = ScannerUtils.inputString("You cannot leave it blank");

					try {
						if (usController.login(username1, password1)) {
							logged = true;
							System.out.println("Login successful");
						} else {
							System.out.println("Login fail");
						}
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Login fail");
					}
				} else {
					System.out.println("you are already logged in");
				}
				break;
			case 3:
				break;
			case 4:
				return;
			default:
				System.out.println("Please enter again in 1 - 4");
			}
		}
	}

	public static void menu() {
		System.out.println("\n=================================Manage User=================================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Register");
		System.out.format(leftAlignFormat, "2. Login");
		System.out.format(leftAlignFormat, "3. Logout");
		System.out.format(leftAlignFormat, "4. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
