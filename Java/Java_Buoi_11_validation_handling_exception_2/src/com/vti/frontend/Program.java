package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args) {
		int choice = -1;
		while (true) {
			menu();
			choice = ScannerUtils.inputInt();
			switch (choice) {
			case 1:
				GroupFunction.getListGroups();
				break;
			case 2:
				GroupFunction.createGroup();
				break;
			case 3:
				System.out.println("Bye bye");
				return;
			default:
				System.out.println("Please enter again in 1 - 3");
			}
		}
	}

	public static void menu() {
		System.out.println("\n================================Manage Group================================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                              |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Show all Group");
		System.out.format(leftAlignFormat, "2. Create");
		System.out.format(leftAlignFormat, "3. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
