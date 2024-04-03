package com.vti.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import com.vti.entity.Position.PositionName;
import com.vti.entity.TypeQuestion.TypeName;

public class Exercise_3 {
	public static void main(String[] args) {
//		Departments
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
		
//		====================================Exercise 3====================================
		System.out.println("====================================Exercise 3====================================");
//		Question 1
//		System.out.println("Question 1");
//		Locale localeQuestion1 = new Locale("vn", "VN");
//		DateFormat dateFormatQ1 = DateFormat.getDateInstance(DateFormat.DEFAULT, localeQuestion1);
//		String dateQuestion1 = dateFormatQ1.format(ex1.createDate);
//		System.out.printf("Create Date: " + dateQuestion1);
		
		
//		Question 2
		System.out.println("\nQuestion 2");
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Exam[] examArr = {ex1, ex2, ex3};
		for (Exam e: examArr) {
			String date = simpleDateFormat.format(e.createDate);
			System.out.println(e.code + ": " + date);

		}
		
//		Question 3
		System.out.println("\nQuestion 3");
		float numberQuestion3 = 5.567098f;
		System.out.printf("%.4f%n", numberQuestion3);
		
//		Question 4
		System.out.println("\nQuestion 4");
		String hoTen = "Nguyễn Tiến Duy";
		System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân%n", hoTen);
		
//		Question 5
		System.out.println("\nQuestion 5");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		
//		Question 6
		System.out.println("\nQuestion 6");
		Account[] accQuestion8 = {acc1, acc2, acc3};
		System.out.printf("%-15s %-15s %-15s\n", "Email", "FullName", "DepartmentName");
		for (Account acc : accQuestion8) {
			System.out.printf("%-15s %-15s %-15s\n", acc.email, acc.fullname, acc.department.departmentName);
		}
	}
}
