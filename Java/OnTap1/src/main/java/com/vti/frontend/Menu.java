package com.vti.frontend;

import com.vti.backend.businesslayer.impl.CandidateService;
import com.vti.utils.ScannerUtils;

public class Menu {
	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			if (!CandidateService.ISLOGIN) {
				menu();
			} else {
				menuAfterLogin();
			}
			choice = ScannerUtils.inputInt();

			switch (choice) {
			case 1:
				if (!CandidateService.ISLOGIN) {
					CandidateFunction.login();
				} else {
					CandidateFunction.logout();
				}
				break;
			case 2:
				if (!CandidateService.ISLOGIN) {
					CandidateFunction.register();
				} else {
					System.out.println("Bye bye");
					return;
				}
				break;
			case 3:
				System.out.println("Bye bye");
				return;
			default:
				System.out.println("Please enter again in menu");
			}
		}
	}

	public static void menu() {
		System.out.println("\n===============================Manage Candidate===============================");
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
		System.out.println("\n===============================Manage Candidate===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Logout");
		System.out.format(leftAlignFormat, "2. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
