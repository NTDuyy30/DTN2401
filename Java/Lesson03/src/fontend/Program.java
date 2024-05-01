package fontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.EmployeesHandler;
import entity.Employees;

public class Program {
	public static List<Employees> empList = new ArrayList<>();

	public static void main(String[] args) {
		empList.add(new Employees(3, "Duy"));
		empList.add(new Employees(1, "Đạt"));
		empList.add(new Employees(2, "Khải"));
		empList.add(new Employees(5, "Tú"));
		empList.add(new Employees(4, "Hà"));

		Scanner sc = new Scanner(System.in);

		EmployeesHandler empHand = new EmployeesHandler();

		byte choice = -1;
		do {
			menu();
			choice = sc.nextByte();

			switch (choice) {
			case 1:
				System.out.println("In ra sach sách nhân viên theo thứ tự tăng dần id");
				System.out.printf("%-5s %-15s%n", "ID", "Name");
				empHand.showEmployeesListASCById(empList);
				break;
			case 2:
				System.out.println("\nThêm mới nhân viên");
				empHand.addEmployee(empList);
				break;
			case 3:
				System.out.println("\nXóa nhân viên theo id");
				System.out.print("Nhập id của nhân viên muốn xóa: ");
				int delId = sc.nextInt();
				empHand.delEmployee(empList, delId);
				break;
			case 4:
				System.out.println("Tạm biệt và hẹn gặp lại");
//				Scannerutils.pro
				break;
			default:
				System.out.println("Mời bạn chọn lại trong khoảng 1 đến 4");
			}
			/*
			 * if (choice == 1 || choice == 2 || choice == 3) {
			 * System.out.println("\nBạn có muốn thực hiện chức năng khác không?");
			 * System.out.println("1. Có"); System.out.println("2. Không"); choice =
			 * sc.nextByte(); if (choice == 2)
			 * System.out.println("Goodbye and see you again <3"); }
			 */
		} while (choice != 4 /* && choice != 2 */);

		sc.close();
	}

	public static void menu() {
		System.out.println("\n==============================Quản lý nhân viên=============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Mời bạn chọn                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Danh sách nhân viên");
		System.out.format(leftAlignFormat, "2. Thêm mới nhân viên");
		System.out.format(leftAlignFormat, "3. Xóa nhân viên");
		System.out.format(leftAlignFormat, "4. Thoát");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
