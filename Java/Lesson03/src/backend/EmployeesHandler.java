package backend;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entity.Employees;

public class EmployeesHandler {
	private Scanner sc = new Scanner(System.in);

	public void showEmployeesListASCById(List<Employees> empList) {
		/*
		 * Option 1: Comparable Collections.sort(empList);
		 */

//		Option 2: Comparator
		Collections.sort(empList, new Comparator<Employees>() {
			@Override
			public int compare(Employees e1, Employees e2) {
				if (e1.getEmployeeId() > e2.getEmployeeId()) {
					return 1;
				} else if (e1.getEmployeeId() < e2.getEmployeeId()) {
					return -1;
				}
				return 0;
			}
		});

		for (Employees e : empList) {
			e.toString();
		}
	}

	public void addEmployee(List<Employees> empList) {
		Employees newEmp = new Employees();
		System.out.print("Nhập id nhân viên: ");
		newEmp.setEmployeeId(sc.nextInt());
		System.out.print("Nhập tên nhân viên: ");
		sc.nextLine();
		newEmp.setEmployeeName(sc.nextLine());
		empList.add(newEmp);
		System.out.println("\tĐã thêm thành công!");
	}

	public void delEmployee(List<Employees> empList, int delId) {
		short count = 0;
		for (byte i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmployeeId() == delId) {
				empList.remove(i);
				i--;
				count++;
			}
		}
		System.out.println("\tĐã xóa thành công " + count + " nhân viên");
	}
}
