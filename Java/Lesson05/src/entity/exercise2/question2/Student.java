package entity.exercise2.question2;

import java.util.Scanner;

public class Student extends Person {
	private int code;
	private float averageScore;
	private String email;

	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.print("Enter student code: ");
		this.code = sc.nextInt();
		System.out.print("Enter student average score: ");
		this.averageScore = sc.nextFloat();
		System.out.print("Enter student email: ");
		this.email = sc.next();
	}

	@Override
	public void showInfo() {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s%n", "Name", "Gender", "DOB", "Address", "Code",
				"Average Score", "Email");
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s%n", super.getName(), super.getGender(),
				super.getDateOfBirth(), super.getAddress(), this.code, this.averageScore, this.email);
	}

	public void checkScholarship() {
		System.out.println(this.averageScore >= 8 ? "This student received a scholarship"
				: "This student doesn't received a scholarship");
	}
}
