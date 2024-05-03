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
				GroupFunction.updateGroup();
				break;
			case 4:
				GroupFunction.deleteGroup();
				break;
			case 5:
				System.out.println("Bye bye");
				return;
			default:
				System.out.println("Please enter again in 1 - 5");
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
		System.out.format(leftAlignFormat, "3. Update");
		System.out.format(leftAlignFormat, "4. Delete");
		System.out.format(leftAlignFormat, "5. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
