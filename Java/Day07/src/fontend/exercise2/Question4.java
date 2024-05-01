package fontend.exercise2;

import java.util.Scanner;

import entity.Department;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Department dep1 = new Department(1, "Dev");
		Department dep2 = new Department(2, "Marketing");
		Department dep3 = new Department(3, "Human resouces");
		Department[] arrDep = { dep1, dep2, dep3 };
		System.out.print("Enter index of Department you want search: ");
		int index = sc.nextInt();

		try {
			getIndex(index, arrDep);
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
	}

	public static void getIndex(int index, Department[] arrDep) {
		System.out.println(arrDep[index]);
	}
}
