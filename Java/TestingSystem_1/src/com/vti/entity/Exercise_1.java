package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Position.PositionName;
import com.vti.entity.TypeQuestion.TypeName;

public class Exercise_1 {

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
		Group[] groupAcc1 = {gr1, gr2};
		acc1.groups = groupAcc1;
		Account[] accountGr1 = {acc1};
		gr1.accounts = accountGr1;

		acc2.accountID = 2;
		acc2.email = "acc2@gmail.com";
		acc2.username = "nvb";
		acc2.fullname = "Nguyễn Văn B";
		acc2.department = dpm2;
		acc2.position = p2;
		acc2.createDate = LocalDate.now();
		Group[] groupAcc2 = {gr1, gr2, gr3};
		acc2.groups = groupAcc2;
		Account[] accountGr2 = {acc1, acc2};
		gr2.accounts = accountGr2;

		acc3.accountID = 3;
		acc3.email = "acc3@gmail.com";
		acc3.username = "nvc";
		acc3.fullname = "Nguyễn Văn C";
		acc3.department = dpm3;
		acc3.position = p4;
		acc3.createDate = LocalDate.now();
		Group[] groupAcc3 = {gr3};
		acc3.groups = groupAcc3;
		Account[] accountGr3 = {acc3};
		gr3.accounts = accountGr3;


//		Group Accout
		GroupAccount gc1 = new GroupAccount();
		GroupAccount gc2 = new GroupAccount();
		GroupAccount gc3 = new GroupAccount();
		GroupAccount gc4 = new GroupAccount();
		gc1.group = gr1;
		gc1.account = acc1;
		gc1.joinDate = LocalDate.now();
		gc2.group = gr2;
		gc2.account = acc2;
		gc2.joinDate = LocalDate.now();
		gc3.group = gr3;
		gc3.account = acc3;
		gc3.joinDate = LocalDate.now();
		gc4.group = gr2;
		gc4.account = acc1;
		gc4.joinDate = LocalDate.now();

//		Type question
		TypeQuestion tq1 = new TypeQuestion();
		TypeQuestion tq2 = new TypeQuestion();
		tq1.typeID = 1;
		tq1.typeName = TypeName.ESSAY;
		tq2.typeID = 2;
		tq2.typeName = TypeName.MULTIPLE_CHOICE;

//		Category question
		CategoryQuestion cq1 = new CategoryQuestion();
		CategoryQuestion cq2 = new CategoryQuestion();
		CategoryQuestion cq3 = new CategoryQuestion();
		cq1.categoryID = 1;
		cq1.categoryName = "Java";
		cq2.categoryID = 2;
		cq2.categoryName = ".Net";
		cq3.categoryID = 3;
		cq3.categoryName = "Python";

//		Question
		Question q1 = new Question();
		Question q2 = new Question();
		Question q3 = new Question();

		q1.questionID = 1;
		q1.content = "JDK trong java là gì";
		q1.category = cq1;
		q1.type = tq1;
		q1.creator = acc1;
		q1.createDate = LocalDate.now();

		q2.questionID = 2;
		q2.content = "Cú pháp in trong C# là gì";
		q2.category = cq2;
		q2.type = tq2;
		q2.creator = acc2;
		q2.createDate = LocalDate.now();

		q3.questionID = 3;
		q3.content = "AI là gì";
		q3.category = cq3;
		q3.type = tq2;
		q3.creator = acc3;
		q3.createDate = LocalDate.now();

//		Answer
		Answer a1 = new Answer();
		Answer a2 = new Answer();
		Answer a3 = new Answer();

		a1.answerID = 1;
		a1.content = "JDK là bộ thư viện của java";
		a1.question = q1;
		a1.isCorrect = true;

		a2.answerID = 2;
		a2.content = "print()";
		a2.question = q2;
		a2.isCorrect = false;

		a3.answerID = 3;
		a3.content = "Artificial Intelligence";
		a3.question = q3;
		a3.isCorrect = true;

//		Exam
		Exam ex1 = new Exam();
		Exam ex2 = new Exam();
		Exam ex3 = new Exam();

		ex1.examID = 1;
		ex1.code = "A01";
		ex1.title = "Exam 90 minutes";
		ex1.category = new CategoryQuestion[] { cq1, cq2 };
		ex1.duration = 90;
		ex1.creator = acc1;
		ex1.createDate = LocalDate.now();

		ex2.examID = 2;
		ex2.code = "B06";
		ex2.title = "Exam 45 minutes";
		ex2.category = new CategoryQuestion[] { cq2, cq3 };
		ex2.duration = 45;
		ex2.creator = acc2;
		ex2.createDate = LocalDate.now();

		ex3.examID = 3;
		ex3.code = "C07";
		ex3.title = "Exam 120 minutes";
		ex3.category = new CategoryQuestion[] { cq1, cq3 };
		ex3.duration = 120;
		ex3.creator = acc3;
		ex3.createDate = LocalDate.now();

//		Exam question
		ExamQuestion eq1 = new ExamQuestion();
		ExamQuestion eq2 = new ExamQuestion();
		ExamQuestion eq3 = new ExamQuestion();

		eq1.exam = ex1;
		eq1.question = q1;
		eq2.exam = ex2;
		eq2.question = q2;
		eq3.exam = ex3;
		eq3.question = q3;		
		
		
//		=======================================Assignment 2=======================================
//		Exercise 1
//		Question 1
		System.out.println("\n\n==========================================Assignment 2==========================================");
		System.out.println("\nQuestion 1");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + acc2.department.departmentName);
		}
		
//		Question 2
		System.out.println("\nQuestion 2");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (acc2.groups.length == 1 || acc2.groups.length == 2){
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (acc2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		
//		Question 3
		System.out.println("\nQuestion 3");
		String question3 = (acc2.department == null) ? "Nhân viên này chưa có phòng ban" 
				: "Phòng ban của nhân viên này là " + acc2.department.departmentName;
		System.out.println(question3);
		
		
//		Question 4
		System.out.println("\nQuestion 4");
		String question4 = (acc1.position.positionName.equals(PositionName.DEV)) ? "Đây là Developer" 
				: "Người này không phải là Developer";
		System.out.println(question4);
		
		
//		Question 5
		System.out.println("\nQuestion 5");
		byte soLuongAccountGroup1 = (byte) gr1.accounts.length; 
		switch (soLuongAccountGroup1) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
		
//		Question 6
		System.out.println("\nQuestion 6");
		byte soLuongGroupCuaAccount2 = (byte) acc2.groups.length;
		switch (soLuongGroupCuaAccount2) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1, 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:			
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
		
//		Question 7
		System.out.println("\nQuestion 7");
		PositionName positionOfAccount1 = acc1.position.positionName;
		switch(positionOfAccount1) {
		case DEV:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		
//		Question 8
		System.out.println("\nQuestion 8");
		Account[] accQuestion8 = {acc1, acc2, acc3};
		System.out.printf("%-15s %-15s %-15s\n", "Email", "FullName", "DepartmentName");
		for (Account acc : accQuestion8) {
			System.out.printf("%-15s %-15s %-15s\n", acc.email, acc.fullname, acc.department.departmentName);
		}
		
//		Question 9
		System.out.println("\nQuestion 9");
		Department[] depQuestion9 = {dpm1, dpm2, dpm3};
		System.out.printf("%-15s %-15s\n", "ID", "DepartmentName");
		for (Department dep : depQuestion9) {
			System.out.printf("%-15s %-15s\n", dep.departmentID, dep.departmentName);
		}
		
//		Question 10
		System.out.println("\nQuestion 10");
		for (byte i = 0; i < accQuestion8.length; i++) {
			System.out.println("Thông tin account thứ " + (i+1) + " là:");
			System.out.println("Email: " + accQuestion8[i].email);
			System.out.println("Full name: " + accQuestion8[i].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i].department.departmentName + "\n");
		}
		
//		Question 11
		System.out.println("\nQuestion 11");
		for (byte i = 0; i < depQuestion9.length; i++) {
			System.out.println("Thông tin của department thứ " + (i+1) + " là:");
			System.out.println("ID: " + depQuestion9[i].departmentID);
			System.out.println("Name: " + depQuestion9[i].departmentName);
		}
		
//		Question 12
		System.out.println("\nQuestion 12");
		for (byte i = 0; i < 2; i++) {
			System.out.println("Thông tin của department thứ " + (i+1) + " là:");
			System.out.println("ID: " + depQuestion9[i].departmentID);
			System.out.println("Name: " + depQuestion9[i].departmentName);
		}
		
//		Question 13
		System.out.println("\nQuestion 13");
		for (byte i = 0; i < accQuestion8.length; i++) {
			if (i == 1) continue;
			System.out.println("Thông tin account thứ " + (i+1) + " là:");
			System.out.println("Email: " + accQuestion8[i].email);
			System.out.println("Full name: " + accQuestion8[i].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i].department.departmentName + "\n");
		}
		
//		Question 14
		System.out.println("\nQuestion 14");
		for (byte i = 0; i < accQuestion8.length; i++) {
			if (accQuestion8[i].accountID >= 4) continue;
			System.out.println("Thông tin account thứ " + (i+1) + " là:");
			System.out.println("Email: " + accQuestion8[i].email);
			System.out.println("Full name: " + accQuestion8[i].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i].department.departmentName + "\n");
		}
		
//		Question 15
		System.out.println("\nQuestion 15");
		for (byte i = 0; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		Question 16
		System.out.println("\nQuestion 16");
		System.out.println("\nQuestion 16a");
		byte i1 = 0;
		while (i1 < accQuestion8.length) {
			System.out.println("Thông tin account thứ " + (i1+1) + " là:");
			System.out.println("Email: " + accQuestion8[i1].email);
			System.out.println("Full name: " + accQuestion8[i1].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i1].department.departmentName + "\n");
			i1++;
		}
		
		System.out.println("\nQuestion 16b");
		byte i2 = 0;
		while (i2 < depQuestion9.length) {
			System.out.println("Thông tin của department thứ " + (i2+1) + " là:");
			System.out.println("ID: " + depQuestion9[i2].departmentID);
			System.out.println("Name: " + depQuestion9[i2].departmentName);
			i2++;
		}
		
		System.out.println("\nQuestion 16c");
		byte i3 = 0;
		while (i3 < 2) {
			System.out.println("Thông tin của department thứ " + (i3+1) + " là:");
			System.out.println("ID: " + depQuestion9[i3].departmentID);
			System.out.println("Name: " + depQuestion9[i3].departmentName);
			i3++;
		}
		
		System.out.println("\nQuestion 16d");
		byte i4 = 0;
		while (i4 < accQuestion8.length) {
			if (i4 == 1) {
				i4++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i4+1) + " là:");
			System.out.println("Email: " + accQuestion8[i4].email);
			System.out.println("Full name: " + accQuestion8[i4].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i4].department.departmentName + "\n");
			i4++;
		}
		
		System.out.println("\nQuestion 16e");
		byte i5 = 0;
		while (i5 < accQuestion8.length) {
			if (accQuestion8[i5].accountID >= 4) {
				i5++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i5+1) + " là:");
			System.out.println("Email: " + accQuestion8[i5].email);
			System.out.println("Full name: " + accQuestion8[i5].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i5].department.departmentName + "\n");
			i5++;
		}
		
		System.out.println("\nQuestion 16f");
		byte i6 = 0;
		while (i6 <= 20) {
			System.out.print(i6 + " ");
			i6 += 2;
		}
		System.out.println();
		
//		Question 17
		System.out.println("\nQuestion 17");
		System.out.println("\nQuestion 17a");
		byte i11 = 0;
		do {
			System.out.println("Thông tin account thứ " + (i11+1) + " là:");
			System.out.println("Email: " + accQuestion8[i11].email);
			System.out.println("Full name: " + accQuestion8[i11].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i11].department.departmentName + "\n");
			i11++;
		} while (i11 < accQuestion8.length);
		
		System.out.println("\nQuestion 17b");
		byte i12 = 0;
		while (i12 < depQuestion9.length) {
			System.out.println("Thông tin của department thứ " + (i12+1) + " là:");
			System.out.println("ID: " + depQuestion9[i12].departmentID);
			System.out.println("Name: " + depQuestion9[i12].departmentName);
			i12++;
		}
		
		System.out.println("\nQuestion 17c");
		byte i13 = 0;
		while (i13 < 2) {
			System.out.println("Thông tin của department thứ " + (i13+1) + " là:");
			System.out.println("ID: " + depQuestion9[i13].departmentID);
			System.out.println("Name: " + depQuestion9[i13].departmentName);
			i13++;
		}
		
		System.out.println("\nQuestion 17d");
		byte i14 = 0;
		while (i14 < accQuestion8.length) {
			if (i14 == 1) {
				i14++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i14+1) + " là:");
			System.out.println("Email: " + accQuestion8[i14].email);
			System.out.println("Full name: " + accQuestion8[i14].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i14].department.departmentName + "\n");
			i14++;
		}
		
		System.out.println("\nQuestion 17e");
		byte i15 = 0;
		while (i15 < accQuestion8.length) {
			if (accQuestion8[i15].accountID >= 4) {
				i15++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i15+1) + " là:");
			System.out.println("Email: " + accQuestion8[i15].email);
			System.out.println("Full name: " + accQuestion8[i15].fullname);
			System.out.println("Phòng ban: " + accQuestion8[i15].department.departmentName + "\n");
			i15++;
		}
		
		System.out.println("\nQuestion 17f");
		byte i16 = 0;
		while (i16 <= 20) {
			System.out.print(i16 + " ");
			i16 += 2;
		}
		System.out.println();
	}
}

