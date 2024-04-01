package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Position.PositionName;
import com.vti.entity.TypeQuestion.TypeName;

public class Program {

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

		acc2.accountID = 2;
		acc2.email = "acc2@gmail.com";
		acc2.username = "nvb";
		acc2.fullname = "Nguyễn Văn B";
		acc2.department = dpm2;
		acc2.position = p2;
		acc2.createDate = LocalDate.now();

		acc3.accountID = 3;
		acc3.email = "acc3@gmail.com";
		acc3.username = "nvc";
		acc3.fullname = "Nguyễn Văn C";
		acc3.department = dpm3;
		acc3.position = p4;
		acc3.createDate = LocalDate.now();

//		Group
		Group gr1 = new Group();
		Group gr2 = new Group();
		Group gr3 = new Group();

		gr1.groupID = 1;
		gr1.groupName = "Group 1";
		gr1.creator = acc1;
		gr1.createDate = LocalDate.now();

		gr2.groupID = 2;
		gr2.groupName = "Group 2";
		gr2.creator = acc2;
		gr2.createDate = LocalDate.now();

		gr3.groupID = 3;
		gr3.groupName = "Group 3";
		gr3.creator = acc3;
		gr3.createDate = LocalDate.now();

//		Group Accout
		GroupAccount gc1 = new GroupAccount();
		GroupAccount gc2 = new GroupAccount();
		GroupAccount gc3 = new GroupAccount();
		gc1.group = gr1;
		gc1.account = acc1;
		gc1.joinDate = LocalDate.now();
		gc2.group = gr2;
		gc2.account = acc2;
		gc2.joinDate = LocalDate.now();
		gc3.group = gr3;
		gc3.account = acc3;
		gc3.joinDate = LocalDate.now();

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

//		Print Department
		System.out.println("====================================Department====================================");
		System.out.println("ID: " + dpm1.departmentID + ", Name:" + dpm1.departmentName);
		System.out.println("ID: " + dpm2.departmentID + ", Name:" + dpm2.departmentName);
		System.out.println("ID: " + dpm3.departmentID + ", Name:" + dpm3.departmentName);

//		Print Position
		System.out.println("\n====================================Position====================================");
		System.out.println("ID: " + p1.positionID + ", Name:" + p1.positionName);
		System.out.println("ID: " + p2.positionID + ", Name:" + p2.positionName);
		System.out.println("ID: " + p3.positionID + ", Name:" + p3.positionName);
		System.out.println("ID: " + p4.positionID + ", Name:" + p4.positionName);

//		Print Account
		System.out.println("\n====================================Account====================================");
		System.out.printf("%5s %15s %15s %15s %15s %15s %15s", "ID", "Email", "Username", "fullname", "department",
				"position", "CreateDate");
		System.out.println();
		System.out.format("%5s %15s %15s %15s %15s %15s %15s", acc1.accountID, acc1.email, acc1.username, acc1.fullname,
				acc1.department.departmentName, acc1.position.positionName, acc1.createDate);
		System.out.println();
		System.out.format("%5s %15s %15s %15s %15s %15s %15s", acc2.accountID, acc2.email, acc2.username, acc2.fullname,
				acc2.department.departmentName, acc2.position.positionName, acc2.createDate);
		System.out.println();
		System.out.format("%5s %15s %15s %15s %15s %15s %15s", acc3.accountID, acc3.email, acc3.username, acc3.fullname,
				acc3.department.departmentName, acc3.position.positionName, acc3.createDate);
		System.out.println();

//		Print Group
		System.out.println("\n====================================Group====================================");
		System.out.printf("%5s %15s %15s %15s", "ID", "groupName", "creator", "createDate");
		System.out.println();
		System.out.format("%5s %15s %15s %15s", gr1.groupID, gr1.groupName, gr1.creator.fullname, gr1.createDate);
		System.out.println();
		System.out.format("%5s %15s %15s %15s", gr2.groupID, gr2.groupName, gr2.creator.fullname, gr2.createDate);
		System.out.println();
		System.out.format("%5s %15s %15s %15s", gr3.groupID, gr3.groupName, gr3.creator.fullname, gr3.createDate);
		System.out.println();

//		Print Group account
		System.out.println("\n====================================Group Account====================================");
		System.out.printf("%10s %15s %15s", "Group", "Account", "JoinDate");
		System.out.println();
		System.out.format("%10s %15s %15s", gc1.group.groupName, gc1.account.fullname, gc1.joinDate);
		System.out.println();
		System.out.format("%10s %15s %15s", gc2.group.groupName, gc2.account.fullname, gc2.joinDate);
		System.out.println();
		System.out.format("%10s %15s %15s", gc3.group.groupName, gc3.account.fullname, gc3.joinDate);
		System.out.println();

//		Print Group Type question
		System.out.println("\n====================================Type Question====================================");
		System.out.println("TypeID: " + tq1.typeID + ", TypeName:" + tq1.typeName);
		System.out.println("TypeID: " + tq2.typeID + ", TypeName:" + tq2.typeName);

//		Print Group category question
		System.out
				.println("\n====================================Category Question====================================");
		System.out.println("CategoryID: " + cq1.categoryID + ", CategoryName:" + cq1.categoryName);
		System.out.println("CategoryID: " + cq2.categoryID + ", CategoryName:" + cq2.categoryName);

//		Print Question
		System.out.println("\n====================================Question====================================");
		System.out.printf("%10s %30s %20s %20s %20s %15s", "questionID", "Content", "category", "type", "creator",
				"createDate");
		System.out.println();
		System.out.format("%10s %30s %20s %20s %20s %15s", q1.questionID, q1.content, q1.category.categoryName,
				q1.type.typeName, q1.creator.fullname, q1.createDate);
		System.out.println();
		System.out.format("%10s %30s %20s %20s %20s %15s", q2.questionID, q2.content, q2.category.categoryName,
				q2.type.typeName, q2.creator.fullname, q2.createDate);
		System.out.println();
		System.out.format("%10s %30s %20s %20s %20s %15s", q3.questionID, q3.content, q3.category.categoryName,
				q3.type.typeName, q3.creator.fullname, q3.createDate);
		System.out.println();

//		Print Answer
		System.out.println("\n====================================Answer====================================");
		System.out.printf("%10s %30s %30s %10s", "answerID", "content", "question", "isCorrect");
		System.out.println();
		System.out.format("%10s %30s %30s %10s", a1.answerID, a1.content, a1.question.content, a1.isCorrect);
		System.out.println();
		System.out.format("%10s %30s %30s %10s", a2.answerID, a2.content, a2.question.content, a2.isCorrect);
		System.out.println();
		System.out.format("%10s %30s %30s %10s", a3.answerID, a3.content, a3.question.content, a3.isCorrect);
		System.out.println();

//		Print Exam
		System.out.println("\n====================================Exam====================================");
		System.out.printf("%10s %10s %30s %10s %10s %10s %15s", "examID", "code", "title", "category", "duration",
				"creatorID", "createDate");
		System.out.println();

		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex1.examID, ex1.code, ex1.title,
				ex1.category[0].categoryName, ex1.duration, ex1.creator.fullname, ex1.createDate);
		System.out.println();
		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex1.examID, ex1.code, ex1.title,
				ex1.category[1].categoryName, ex1.duration, ex1.creator.fullname, ex1.createDate);
		System.out.println();

		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex2.examID, ex2.code, ex2.title,
				ex2.category[0].categoryName, ex2.duration, ex2.creator.fullname, ex2.createDate);
		System.out.println();
		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex2.examID, ex2.code, ex2.title,
				ex2.category[1].categoryName, ex2.duration, ex2.creator.fullname, ex2.createDate);
		System.out.println();

		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex3.examID, ex3.code, ex3.title,
				ex3.category[0].categoryName, ex3.duration, ex3.creator.fullname, ex3.createDate);
		System.out.println();
		System.out.format("%10s %10s %30s %10s %10s %10s %15s", ex3.examID, ex3.code, ex3.title,
				ex3.category[1].categoryName, ex3.duration, ex3.creator.fullname, ex3.createDate);
		System.out.println();

//		print exam question
		System.out.println("\n====================================Exam Question====================================");
		System.out.println("Exam: " + eq1.exam.title + ", Question:" + eq1.question.content);
		System.out.println("Exam: " + eq2.exam.title + ", Question:" + eq2.question.content);
		System.out.println("Exam: " + eq3.exam.title + ", Question:" + eq3.question.content);

	}

}
