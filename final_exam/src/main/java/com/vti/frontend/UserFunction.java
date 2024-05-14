package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entiy.Employee;
import com.vti.entiy.Manager;
import com.vti.utils.ScannerUtils;

public class UserFunction {
//	Login
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

//	Logout
	public static void logout() {
		try {
			UserController con = new UserController();
			con.logout();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	Get all employee by projectId
	public static void getAllEmployeeByProjectId() {
		UserController con;
		try {
			con = new UserController();
			int projectId;
			while (true) {
				projectId = ScannerUtils.inputId("Input project id: ");
				if (!con.isProjectIdExists(projectId)) {
					System.out.println("Please enter project id again because it not exists: ");
				} else {
					break;
				}
			}
			
			List<Employee> emps = con.getAllEmployeeByProjectId(projectId);
			
			if (emps.size() == 0) {
				System.out.println("There is no Employee");
				return;
			}
			
			String leftAlignFormat = "|  %-6s  |  %-25s  |  %-25s  |  %-9s  |  %-10s  |  %-7s  |%n";
			System.out.format("+----------------------------------------------------------------------------------------------------------------+%n");
			System.out.format("|  ID      |  Full name                  |  Email                      |  Pro Skill  |  Project ID  |  Role      |%n");
			System.out.format("+----------------------------------------------------------------------------------------------------------------+%n");
			for (Employee e : emps) {
				System.out.printf(leftAlignFormat, e.getId(), e.getFullname(), e.getEmail(), e.getProSkill(), e.getProjectId(), e.getRole());
			}
			System.out.format("+----------------------------------------------------------------------------------------------------------------+%n");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
//	Get all manager by projectId
	public static void getAllManagerByProjectId() {
		UserController con;
		try {
			con = new UserController();
			int projectId;
			while (true) {
				projectId = ScannerUtils.inputId("Input project id: ");
				if (!con.isProjectIdExists(projectId)) {
					System.out.println("Please enter project id again because it not exists: ");
				} else {
					break;
				}
			}
			
			List<Manager> mngs = con.getAllManagerByProjectId(projectId);
			
			if (mngs.size() == 0) {
				System.out.println("There is no Manager");
				return;
			}
			
			String leftAlignFormat = "|  %-6s  |  %-25s  |  %-25s  |  %-11s  |  %-10s  |  %-8s  |%n";
			System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
			System.out.format("|  ID      |  Full name                  |  Email                      |  Exp In Year  |  Project ID  |  Role      |%n");
			System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
			for (Manager m : mngs) {
				System.out.printf(leftAlignFormat, m.getId(), m.getFullname(), m.getEmail(), m.getExpInYear(), m.getProjectId(), m.getRole());
			}
			System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
