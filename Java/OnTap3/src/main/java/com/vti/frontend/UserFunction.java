package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entiy.Employee;
import com.vti.entiy.Employee.ProSkill;
import com.vti.entiy.User;
import com.vti.utils.ScannerUtils;

public class UserFunction {
	public static void login() {
		try {
			UserController con = new UserController();
			String email = ScannerUtils.inputEmail();
			String passwrod = ScannerUtils.inputPassword();
			if (con.login(email, passwrod)) {
				System.out.println("Login successful!");
			} else {
				System.out.println("Login fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			UserController con = new UserController();
			con.logout();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getAllUser() {
		UserController con;
		try {
			con = new UserController();
			List<User> users = con.getAllUser();
			String leftAlignFormat = "|  %-6s  |  %-25s  |  %-25s  |%n";
			System.out.format("+----------------------------------------------------------------------+%n");
			System.out.format("|  ID      |  Full name                  |  Email                      |%n");
			System.out.format("+----------------------------------------------------------------------+%n");
			for (User u : users) {
				System.out.printf(leftAlignFormat, u.getId(), u.getFullname(), u.getEmail());
			}
			System.out.format("+----------------------------------------------------------------------+%n");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getUserById() {
		UserController con;
		try {
			con = new UserController();
			int userId = ScannerUtils.inputId("Input user id: ");
			User user = con.getUserById(userId);
			if (user == null) {
				System.out.println("Id not exists!!!");
			} else {
				String leftAlignFormat = "|  %-6s  |  %-25s  |  %-25s  |%n";
				System.out.format("+----------------------------------------------------------------------+%n");
				System.out.format("|  ID      |  Full name                  |  Email                      |%n");
				System.out.format("+----------------------------------------------------------------------+%n");
				System.out.printf(leftAlignFormat, user.getId(), user.getFullname(), user.getEmail());
				System.out.format("+----------------------------------------------------------------------+%n");
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteUserById() {
		try {
			UserController con = new UserController();
			int userId = ScannerUtils.inputId("Input user id you want delete: ");

			if (con.deleteUserById(userId)) {
				System.out.println("Delete User successful");
			} else {
				System.out.println("Delete fail! Maybe because the id doesn't exist");
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createEmployee() {
		try {
			UserController con = new UserController();

//			check email exists
			String email = null;
			while (true) {
				email = ScannerUtils.inputEmail();
				if (con.isEmailExists(email)) {
					System.out.println("Email already exists! Please enter email again");
				} else {
					break;
				}
			}

			String fullname = ScannerUtils.inputName("Input full name: ");

//			Input pro skill
			ProSkill proSkill = null;
			byte choice = -1;
			do {
				System.out.println("Input pro skill: ");
				System.out.println("1. DEV");
				System.out.println("2. TEST");
				System.out.println("3. JAVA");
				System.out.println("4. SQL");
				choice = (byte) ScannerUtils.inputInt();
			} while (choice < 1 || choice > 4);

			switch (choice) {
			case 1:
				proSkill = ProSkill.DEV;
				break;
			case 2:
				proSkill = ProSkill.TEST;
				break;
			case 3:
				proSkill = ProSkill.JAVA;
				break;
			case 4:
				proSkill = ProSkill.SQL;
				break;
			}

			if (con.createEmployee(new Employee(fullname, email, proSkill))) {
				System.out.println("Create a new Employee successful!");
			} else {
				System.out.println("Create a new Employee fail!");
			}

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
