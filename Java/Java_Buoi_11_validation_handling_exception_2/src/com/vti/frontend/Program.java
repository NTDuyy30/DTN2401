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
//				Get list group
				GroupFunction.getListGroups();
				break;
			case 2:
//				Create a new group
				GroupFunction.createGroup();
				break;
			case 3:
//				Update group by id
				GroupFunction.updateGroup();
				break;
			case 4:
//				Update group by id with Procedure
				GroupFunction.updateGroupWithProcedure();
				break;
			case 5:
//				Delete group by id
				GroupFunction.deleteGroup();
				break;
			case 6:
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
		System.out.format(leftAlignFormat, "4. Update with Procedure");
		System.out.format(leftAlignFormat, "5. Delete");
		System.out.format(leftAlignFormat, "6. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
