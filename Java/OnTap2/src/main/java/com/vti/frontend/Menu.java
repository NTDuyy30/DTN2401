package com.vti.frontend;

import com.vti.backend.businesslayer.AccountService;
import com.vti.utils.ScannerUtils;

public class Menu {
	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			menu();
			choice = ScannerUtils.inputInt();

			switch (choice) {
			case 1:
				if (!AccountService.ISLOGIN) {
					AccountFunction.login();
				} else {
					System.out.println("you are logged in!!!");
				}
				break;
			case 2:
				AccountFunction.getAccountByProjectId();
				break;
			case 3:
				AccountFunction.getManagerOfProject();
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
		System.out.println("\n===============================Manage Candidate============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Login");
		System.out.format(leftAlignFormat, "2. Get all account of project by id");
		System.out.format(leftAlignFormat, "3. Get all Manager of project");
		System.out.format(leftAlignFormat, "4. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
