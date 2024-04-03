package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Position.PositionName;

public class Exercise_6 {
	public static void printPositiveEvenIntegerLessThan10() {
		System.out.print("Các số chẵn nguyên dương nhỏ hơn 10: ");
		for (byte i = 2; i < 10; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void printAccount(Account[] arr) {
		System.out.printf("%-5s %15s %15s %15s %15s %15s %15s%n", "ID", "Email", "Username", "fullname", "department",
				"position", "CreateDate");
		for (Account a : arr) {
//			cách 1
			System.out.format("%-5s %15s %15s %15s %15s %15s %15s%n", a.accountID, a.email, a.username, a.fullname,
					a.department.departmentName, a.position.positionName, a.createDate);
//			cách 2
//			System.out.println(a);
		}
	}

	public static void printPositiveIntegerLessThan10() {
		System.out.print("Các số nguyên dương nhỏ hơn 10: ");
		for (byte i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}
	}

//	Main method
	public static void main(String[] args) {
//		Department
		Department dpm1 = new Department();
		Department dpm2 = new Department();
		Department dpm3 = new Department();

		dpm1.departmentID = 1;
		dpm1.departmentName = "IT";

		dpm2.departmentID = 2;
		dpm2.departmentName = "Sale";

		dpm3.departmentID = 3;
		dpm3.departmentName = "Marketing";

//		Position
		Position p1 = new Position();
		Position p2 = new Position();
		Position p3 = new Position();
		Position p4 = new Position();

		p1.positionID = 1;
		p1.positionName = PositionName.DEV;

		p2.positionID = 2;
		p2.positionName = PositionName.PM;

		p3.positionID = 3;
		p3.positionName = PositionName.SCRUM_MASTER;

		p4.positionID = 4;
		p4.positionName = PositionName.TEST;

//		Group
		Group gr1 = new Group();
		Group gr2 = new Group();
		Group gr3 = new Group();

		gr1.groupID = 1;
		gr1.groupName = "Group 1";
//		gr1.creator = acc1;
		gr1.createDate = LocalDate.now();

		gr2.groupID = 2;
		gr2.groupName = "Group 2";
//		gr2.creator = acc2;
		gr2.createDate = LocalDate.now();

		gr3.groupID = 3;
		gr3.groupName = "Group 3";
//		gr3.creator = acc3;
		gr3.createDate = LocalDate.now();

//		Account
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();

		acc1.accountID = 1;
		acc1.email = "acc1@gmail.com";
		acc1.username = "nva";
		acc1.fullname = "Nguyễn Văn A";
		acc1.department = dpm1;
		acc1.position = p1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { gr1, gr2 };
		acc1.groups = groupAcc1;
		Account[] accountGr1 = { acc1 };
		gr1.accounts = accountGr1;

		acc2.accountID = 2;
		acc2.email = "acc2@gmail.com";
		acc2.username = "nvb";
		acc2.fullname = "Nguyễn Văn B";
		acc2.department = dpm2;
		acc2.position = p2;
		acc2.createDate = LocalDate.now();
		Group[] groupAcc2 = { gr1, gr2, gr3 };
		acc2.groups = groupAcc2;
		Account[] accountGr2 = { acc1, acc2 };
		gr2.accounts = accountGr2;

		acc3.accountID = 3;
		acc3.email = "acc3@gmail.com";
		acc3.username = "nvc";
		acc3.fullname = "Nguyễn Văn C";
		acc3.department = dpm3;
		acc3.position = p4;
		acc3.createDate = LocalDate.now();
		Group[] groupAcc3 = { gr3 };
		acc3.groups = groupAcc3;
		Account[] accountGr3 = { acc3 };
		gr3.accounts = accountGr3;

//		Exercise 6
		System.out
				.println("========================================Exercise 6========================================");
//		Question 1
		System.out.println("Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10");
		printPositiveEvenIntegerLessThan10();

//		Question 2
		System.out.println("\n\nQuestion 2: Tạo method để in thông tin các account");
		Account[] accountArr = { acc1, acc2, acc3 };
		printAccount(accountArr);

//		Question 3
		System.out.println("\nQuestion 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10");
		printPositiveIntegerLessThan10();
	}
}
