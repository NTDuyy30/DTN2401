//package com.vti.entity;
//
//import java.time.LocalDate;
//import java.util.Random;
//import java.util.Scanner;
//
//import com.vti.entity.Position.PositionName;
//
//public class Exercise_5 {
//	public static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
////		Exercise 5
//		System.out.println("====================================Exercise 5====================================");
////		Question 1
////		System.out.println("Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.");
////		int integerNumber1, integerNumber2, integerNumber3;
////		System.out.print("Enter integer number 1 = ");
////		integerNumber1 = sc.nextInt();
////		System.out.print("Enter integer number 2 = ");
////		integerNumber2 = sc.nextInt();
////		System.out.print("Enter integer number 3 = ");
////		integerNumber3 = sc.nextInt();
////		System.out.println("You just entered the following numbers: " + integerNumber1 + ", " + integerNumber2 + " ,"
////				+ integerNumber3);
//
////		Question 2
////		System.out.println("\nQuestion 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình");
////		float realNumber1, realNumber2;
////		System.out.print("Enter real number 1: ");
////		realNumber1 = sc.nextFloat();
////		System.out.print("Enter real number 2: ");
////		realNumber2 = sc.nextFloat();
////		System.out.println("You just entered the following numbers: " + realNumber1 + ", " + realNumber2);
//
////		Question 3
////		System.out.println("\nQuestion 3: Viết lệnh cho phép người dùng nhập họ và tên");
////		String firtName, lastName;
////		System.out.print("Enter first name: ");
////		firtName = sc.next();
////		System.out.print("Enter last name: ");
////		lastName = sc.next();
////		System.out.println("Your full name is: " + firtName + " " + lastName);
//
////		Question 4
////		System.out.println("\nQuestion 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ");
////		int day, month, year;
////		System.out.println("Enter your date of birth: ");
////		System.out.print("\tEnter your day of birth: ");
////		day = sc.nextInt();
////		System.out.print("\tEnter your month of birth: ");
////		month = sc.nextInt();
////		System.out.print("\tEnter your year of birth: ");
////		year = sc.nextInt();
////		LocalDate birthday = LocalDate.of(year, month, day);
////		System.out.println("Your birthday is: " + birthday);
//
////		Question 5
////		System.out.println("\nQuestion 5: Viết lệnh cho phép người dùng tạo account (viết thành method)");
////		Account newAcc = new Account();
////		createAcc(newAcc);
//
////		Question 6
//		System.out.println("\nQuestion 6: Viết lệnh cho phép người dùng tạo department (viết thành method)");
//		Department newDep = new Department();
//		createDepartment(newDep);
//
////		Question 7
////		System.out.println("\nQuestion 7: Nhập số chẵn từ console");
////		int evenNum = -1;
////		do {
////			System.out.print("Enter even number: ");
////			evenNum = sc.nextInt();
////			if (evenNum % 2 != 0) {
////				System.out.println("This is not an even number!");
////			}
////		} while (evenNum % 2 != 0);
////		System.out.println("Even number = " + evenNum);
//
////		Question 8
////		Option 1
////		System.out.println("Viết chương trình thực hiện theo flow sau: " + "\nBước 1: "
////				+ "\n\tChương trình in ra text \"mời bạn nhập vào chức năng muốn sử dụng\" " + "\nBước 2: "
////				+ "\n\tNếu người dùng nhập vào 1 thì sẽ thực hiện tạo account "
////				+ "\n\tNếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department "
////				+ "\n\tNếu người dùng nhập vào số khác thì in ra text \"Mời bạn nhập lại\" và quay trở lại bước 1\r\n");
////		byte choice = -1;
////		do {
////			System.out.println("\n---------------Mời bạn nhập vào chức năng muốn sử dụng---------------");
////			String leftAlignFormat = "| %-72s |%n";
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			System.out.format("|                               Choose please                              |%n");
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			System.out.format(leftAlignFormat, "1. Tạo account");
////			System.out.format(leftAlignFormat, "2. Tạo department");
////			System.out.format(leftAlignFormat, "3. Exit");
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			choice = sc.nextByte();
////			switch (choice) {
////			case 1:
////				Account newAcc = new Account();
////				createAcc(newAcc);
////				break;
////			case 2:
////				Department newDep = new Department();
////				createDepartment(newDep);
////				break;
////			case 3:
////				System.out.println("Exit");
////				break;
////			default:
////				System.out.println("!!Mời bạn nhập lại");
////				break;
////			}
////		} while (choice != 3);
//
////		Option 2
////		System.out.println("Viết chương trình thực hiện theo flow sau: " + "\nBước 1: "
////				+ "\n\tChương trình in ra text \"mời bạn nhập vào chức năng muốn sử dụng\" " + "\nBước 2: "
////				+ "\n\tNếu người dùng nhập vào 1 thì sẽ thực hiện tạo account "
////				+ "\n\tNếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department "
////				+ "\n\tNếu người dùng nhập vào số khác thì in ra text \"Mời bạn nhập lại\" và quay trở lại bước 1\r\n");
////		byte choice = -1;
////		while (true) {
////			System.out.println("\n---------------Mời bạn nhập vào chức năng muốn sử dụng---------------");
////			String leftAlignFormat = "| %-72s |%n";
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			System.out.format("|                               Choose please                              |%n");
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			System.out.format(leftAlignFormat, "1. Tạo account");
////			System.out.format(leftAlignFormat, "2. Tạo department");
////			System.out.format(leftAlignFormat, "3. Exit");
////			System.out.format("+--------------------------------------------------------------------------+%n");
////			choice = sc.nextByte();
////			switch (choice) {
////			case 1:
////				Account newAcc = new Account();
////				createAcc(newAcc);
////				break;
////			case 2:
////				Department newDep = new Department();
////				createDepartment(newDep);
////				break;
////			case 3:
////				System.out.println("Exit");
////				return;
////			default:
////				System.out.println("!!Mời bạn nhập lại trong khoảng 1 đến 3");
////				break;
////			}
////		}
//
////		Question 9
////		System.out.println("\nQuestion 9: Viết method cho phép người dùng thêm group vào account theo flow sau");
////		Question9();
//
////		Question 10
////		System.out.println("\nQuestion 10");
////		Question10();
//
////		Question 11
//		System.out.println("\nQuestion 11");
//		Question11();
//	}
//
////	Question 5
//	public static void createAcc() {
//		System.out.println("\nQuestion 5: Viết lệnh cho phép người dùng tạo account (viết thành method)");
//		int id;
//		String email, fullName, userName, department;
//		byte position = 0;
//		LocalDate createDate;
//
//		System.out.print("Enter account id: ");
//		id = sc.nextInt();
//
//		System.out.print("Enter account email: ");
//		email = sc.next();
//		sc.nextLine();
//
//		System.out.print("Enter account fullName: ");
//		fullName = sc.nextLine();
//
//		System.out.print("Enter account userName: ");
//		userName = sc.next();
//		sc.nextLine();
//
//		System.out.print("Enter account department: ");
//		department = sc.nextLine();
//
//		do {
//			System.out.print("Enter account position (from 1 to 4): ");
//			position = sc.nextByte();
//		} while (position < 1 || position > 4);
//
//		System.out.println("Enter account create date");
//		System.out.print("\tEnter account day: ");
//		int dayAcc = sc.nextInt();
//		System.out.print("\tEnter account month: ");
//		int monthAcc = sc.nextInt();
//		System.out.print("\tEnter account year: ");
//		int yearAcc = sc.nextInt();
//		createDate = LocalDate.of(yearAcc, monthAcc, dayAcc);
//
//		Account newAcc = new Account();
//		newAcc.accountID = id;
//		newAcc.email = email;
//		newAcc.fullname = fullName;
//		newAcc.username = userName;
//		newAcc.department = new Department();
//		newAcc.department.departmentName = department;
//		newAcc.position = new Position();
//		switch (position) {
//		case 1:
//			newAcc.position.positionName = PositionName.DEV;
//			break;
//		case 2:
//			newAcc.position.positionName = PositionName.TEST;
//			break;
//		case 3:
//			newAcc.position.positionName = PositionName.SCRUM_MASTER;
//			break;
//		default:
//			newAcc.position.positionName = PositionName.PM;
//			break;
//		}
//		newAcc.createDate = createDate;
//
//		System.out.println(newAcc.accountID);
//		System.out.println(newAcc.email);
//		System.out.println(newAcc.fullname);
//		System.out.println(newAcc.username);
//		System.out.println(newAcc.department.departmentName);
//		System.out.println(newAcc.position.positionName);
//		System.out.println(newAcc.createDate);
//
//	}
//
////	Question 6
//	public static void createDepartment() {
//		System.out.println("\nQuestion 6: Viết lệnh cho phép người dùng tạo department (viết thành method)");
//		Department newDep = new Department();
//		int id = 0;
//		System.out.print("Enter department ID: ");
//		id = sc.nextInt();
//
//		String name = null;
//		System.out.print("Enter department name: ");
//		sc.nextLine();
//		name = sc.nextLine();
//
//		newDep.departmentID = id;
//		newDep.departmentName = name;
//
//		System.out.println("Department ID: " + newDep.departmentID);
//		System.out.println("Department Name: " + newDep.departmentName);
//	}
//
////	Question 9
//	public static void Question9() {
////		Department
//		Department dpm1 = new Department();
//		Department dpm2 = new Department();
//		Department dpm3 = new Department();
//
//		dpm1.departmentID = 1;
//		dpm1.departmentName = "IT";
//
//		dpm2.departmentID = 2;
//		dpm2.departmentName = "Sale";
//
//		dpm3.departmentID = 3;
//		dpm3.departmentName = "Marketing";
//
////		Position
//		Position p1 = new Position();
//		Position p2 = new Position();
//		Position p3 = new Position();
//		Position p4 = new Position();
//
//		p1.positionID = 1;
//		p1.positionName = PositionName.DEV;
//
//		p2.positionID = 2;
//		p2.positionName = PositionName.PM;
//
//		p3.positionID = 3;
//		p3.positionName = PositionName.SCRUM_MASTER;
//
//		p4.positionID = 4;
//		p4.positionName = PositionName.TEST;
//
////		Group
//		Group gr1 = new Group();
//		Group gr2 = new Group();
//		Group gr3 = new Group();
//
//		gr1.groupID = 1;
//		gr1.groupName = "Group 1";
////		gr1.creator = acc1;
//		gr1.createDate = LocalDate.now();
//
//		gr2.groupID = 2;
//		gr2.groupName = "Group 2";
////		gr2.creator = acc2;
//		gr2.createDate = LocalDate.now();
//
//		gr3.groupID = 3;
//		gr3.groupName = "Group 3";
////		gr3.creator = acc3;
//		gr3.createDate = LocalDate.now();
//
////		Account
//		Account acc1 = new Account();
//		Account acc2 = new Account();
//		Account acc3 = new Account();
//
//		acc1.accountID = 1;
//		acc1.email = "acc1@gmail.com";
//		acc1.username = "nva";
//		acc1.fullname = "Nguyễn Văn A";
//		acc1.department = dpm1;
//		acc1.position = p1;
//		acc1.createDate = LocalDate.now();
//		Group[] groupAcc1 = { gr1, gr2 };
//		acc1.groups = groupAcc1;
//		Account[] accountGr1 = { acc1 };
//		gr1.accounts = accountGr1;
//
//		acc2.accountID = 2;
//		acc2.email = "acc2@gmail.com";
//		acc2.username = "nvb";
//		acc2.fullname = "Nguyễn Văn B";
//		acc2.department = dpm2;
//		acc2.position = p2;
//		acc2.createDate = LocalDate.now();
//		Group[] groupAcc2 = { gr1, gr2, gr3 };
//		acc2.groups = groupAcc2;
//		Account[] accountGr2 = { acc1, acc2 };
//		gr2.accounts = accountGr2;
//
//		acc3.accountID = 3;
//		acc3.email = "acc3@gmail.com";
//		acc3.username = "nvc";
//		acc3.fullname = "Nguyễn Văn C";
//		acc3.department = dpm3;
//		acc3.position = p4;
//		acc3.createDate = LocalDate.now();
//		Group[] groupAcc3 = { gr3 };
//		acc3.groups = groupAcc3;
//		Account[] accountGr3 = { acc3 };
//		gr3.accounts = accountGr3;
//
//		Account[] accountArr = { acc1, acc2, acc3 };
//		Group[] groupAcc = { gr1, gr2, gr3 };
//
//		System.out.println("Bước 1: In ra tên các usernames của user cho người dùng xem");
//		for (Account a : accountArr) {
//			System.out.println(a.username);
//		}
//
//		System.out.println("\nBước 2: Yêu cầu người dùng nhập vào username của account");
//		System.out.print("Nhập username cho account: ");
//		String username = sc.next();
//
//		System.out.println("\nBước 3: In ra tên các group cho người dùng xem");
//		for (Group gr : groupAcc) {
//			System.out.println(gr.groupName);
//		}
//
//		System.out.println("\nBước 4: Yêu cầu người dùng nhập vào tên của group");
//		System.out.print("Nhập tên cho group: ");
//		sc.nextLine();
//		String groupName = sc.nextLine();
//
//		System.out.println(
//				"\nBước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó");
//		int indexGroup = -1;
//		for (int i = 0; i < groupAcc.length; i++) {
//			if (groupAcc[i].groupName.equals(groupName)) {
//				indexGroup = i;
//			}
//		}
//		int indexAccount = -1;
//		for (int j = 0; j < accountArr.length; j++) {
//			if (accountArr[j].username.equals(username)) {
//				indexAccount = j;
//			}
//		}
//
//		if (indexAccount < 0 || indexGroup < 0) {
//			System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc group này trên hệ thống");
//		} else {
//			for (int j = 0; j < accountArr.length; j++) {
//				if (accountArr[j].username.equals(username)) {
//					Group[] gpAdd = { groupAcc[indexGroup] };
//					accountArr[j].groups = gpAdd;
//					System.out.println("Bạn vừa Add group: " + accountArr[indexAccount].groups[0].groupName
//							+ " cho Account: " + accountArr[indexAccount].username);
//				}
//			}
//		}
//	}
//
////	Question 10
//	public static void Question10() {
//		System.out.println("\nQuestion 10");
//		byte choice = -1;
//		do {
//			System.out.println("\n---------------Mời bạn nhập vào chức năng muốn sử dụng---------------");
//			String leftAlignFormat = "| %-72s |%n";
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			System.out.format("|                               Choose please                              |%n");
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			System.out.format(leftAlignFormat, "1. Tạo account");
//			System.out.format(leftAlignFormat, "2. Tạo department");
//			System.out.format(leftAlignFormat, "3. Thêm group vào account");
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			choice = sc.nextByte();
//			switch (choice) {
//			case 1:
//				Account newAcc = new Account();
//				createAcc(newAcc);
//				break;
//			case 2:
//				Department newDep = new Department();
//				createDepartment(newDep);
//				break;
//			case 3:
//				Question9();
//				break;
//			default:
//				System.out.println("!!Mời bạn nhập lại");
//				break;
//			}
//			if (choice == 1 || choice == 2 || choice == 3) {
//				System.out.println("\nBạn có muốn thực hiện chức năng khác không?");
//				System.out.println("1. Có");
//				System.out.println("2. Không");
//				choice = sc.nextByte();
//				if (choice == 2)
//					System.out.println("Goodbye and see you again <3");
//			}
//		} while (choice != 2);
//	}
//
////	Question 11
//	public static void Question11() {
//		System.out.println("\nQuestion 10");
//		byte choice = -1;
//		do {
//			System.out.println("\n---------------Mời bạn nhập vào chức năng muốn sử dụng---------------");
//			String leftAlignFormat = "| %-72s |%n";
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			System.out.format("|                               Choose please                              |%n");
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			System.out.format(leftAlignFormat, "1. Tạo account");
//			System.out.format(leftAlignFormat, "2. Tạo department");
//			System.out.format(leftAlignFormat, "3. Thêm group vào account");
//			System.out.format(leftAlignFormat, "4. Thêm account vào 1 nhóm ngẫu nhiên");
//			System.out.format("+--------------------------------------------------------------------------+%n");
//			choice = sc.nextByte();
//			switch (choice) {
//			case 1:
//				Account newAcc = new Account();
//				createAcc(newAcc);
//				break;
//			case 2:
//				Department newDep = new Department();
//				createDepartment(newDep);
//				break;
//			case 3:
//				Question9();
//				break;
//			case 4:
//				addAccountToRandomGroup();
//				break;
//			default:
//				System.out.println("!!Mời bạn nhập lại");
//				break;
//			}
//			if (choice == 1 || choice == 2 || choice == 3) {
//				System.out.println("\nBạn có muốn thực hiện chức năng khác không?");
//				System.out.println("1. Có");
//				System.out.println("2. Không");
//				choice = sc.nextByte();
//				if (choice == 2)
//					System.out.println("Goodbye and see you again <3");
//			}
//		} while (choice != 2);
//	}
//
//	public static void addAccountToRandomGroup() {
////		Department
//		Department dpm1 = new Department();
//		Department dpm2 = new Department();
//		Department dpm3 = new Department();
//
//		dpm1.departmentID = 1;
//		dpm1.departmentName = "IT";
//
//		dpm2.departmentID = 2;
//		dpm2.departmentName = "Sale";
//
//		dpm3.departmentID = 3;
//		dpm3.departmentName = "Marketing";
//
////		Position
//		Position p1 = new Position();
//		Position p2 = new Position();
//		Position p3 = new Position();
//		Position p4 = new Position();
//
//		p1.positionID = 1;
//		p1.positionName = PositionName.DEV;
//
//		p2.positionID = 2;
//		p2.positionName = PositionName.PM;
//
//		p3.positionID = 3;
//		p3.positionName = PositionName.SCRUM_MASTER;
//
//		p4.positionID = 4;
//		p4.positionName = PositionName.TEST;
//
////		Group
//		Group gr1 = new Group();
//		Group gr2 = new Group();
//		Group gr3 = new Group();
//
//		gr1.groupID = 1;
//		gr1.groupName = "Group 1";
////		gr1.creator = acc1;
//		gr1.createDate = LocalDate.now();
//
//		gr2.groupID = 2;
//		gr2.groupName = "Group 2";
////		gr2.creator = acc2;
//		gr2.createDate = LocalDate.now();
//
//		gr3.groupID = 3;
//		gr3.groupName = "Group 3";
////		gr3.creator = acc3;
//		gr3.createDate = LocalDate.now();
//
////		Account
//		Account acc1 = new Account();
//		Account acc2 = new Account();
//		Account acc3 = new Account();
//
//		acc1.accountID = 1;
//		acc1.email = "acc1@gmail.com";
//		acc1.username = "nva";
//		acc1.fullname = "Nguyễn Văn A";
//		acc1.department = dpm1;
//		acc1.position = p1;
//		acc1.createDate = LocalDate.now();
//		Group[] groupAcc1 = { gr1, gr2 };
//		acc1.groups = groupAcc1;
//		Account[] accountGr1 = { acc1 };
//		gr1.accounts = accountGr1;
//
//		acc2.accountID = 2;
//		acc2.email = "acc2@gmail.com";
//		acc2.username = "nvb";
//		acc2.fullname = "Nguyễn Văn B";
//		acc2.department = dpm2;
//		acc2.position = p2;
//		acc2.createDate = LocalDate.now();
//		Group[] groupAcc2 = { gr1, gr2, gr3 };
//		acc2.groups = groupAcc2;
//		Account[] accountGr2 = { acc1, acc2 };
//		gr2.accounts = accountGr2;
//
//		acc3.accountID = 3;
//		acc3.email = "acc3@gmail.com";
//		acc3.username = "nvc";
//		acc3.fullname = "Nguyễn Văn C";
//		acc3.department = dpm3;
//		acc3.position = p4;
//		acc3.createDate = LocalDate.now();
//		Group[] groupAcc3 = { gr3 };
//		acc3.groups = groupAcc3;
//		Account[] accountGr3 = { acc3 };
//		gr3.accounts = accountGr3;
//
//		Account[] accountArr = { acc1, acc2, acc3 };
//		Group[] groupAcc = { gr1, gr2, gr3 };
//
//		System.out.println("Danh sách User đang có trên hệ thống: ");
//		for (int i = 0; i < accountArr.length; i++) {
//			System.out.println(accountArr[i].username);
//		}
//		System.out.println("Nhập vào UserName của account: ");
//		String userName = sc.next();
//
//		System.out.println("Danh sách Group đang có trên hệ thống: ");
//		for (int i = 0; i < accountArr.length; i++) {
//			System.out.println(groupAcc[i].groupName);
//		}
//
//		Random random = new Random();
//		int indexGroup = random.nextInt(2);
//
//		int indexAccount = -1;
//		for (int j = 0; j < accountArr.length; j++) {
//			if (accountArr[j].username.equals(userName)) {
//				indexAccount = j;
//			}
//		}
//
//		if (indexAccount < 0) {
//			System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account này trên hệ thống");
//		} else {
//			for (int j = 0; j < accountArr.length; j++) {
//				if (accountArr[j].username.equals(userName)) {
//					Group[] gpAdd = { groupAcc[indexGroup] };
//					accountArr[j].groups = gpAdd;
//					System.out.println("Bạn vừa Add group: " + accountArr[indexAccount].groups[0].groupName
//							+ " cho Account: " + accountArr[indexAccount].username);
//				}
//			}
//		}
//	}
//}
