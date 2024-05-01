package backend;

import java.util.Scanner;

import entity.Account;

public class Exercise_1 {
	private Scanner sc = new Scanner(System.in);

	public void question1() {
		System.out.println("Question 1");
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.luong = 5240.5f;
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.luong = 10970.055f;
		acc1.toString();
		acc2.toString();

		int a = (int) acc1.luong;
		int b = (int) acc2.luong;

		System.out.println(a);
		System.out.println(b);
	}

	public float question4() {
		System.out.println("\nQuestion 4");
		int a, b;
		System.out.print("Nhập a = ");
		a = sc.nextInt();
		System.out.print("Nhập b = ");
		b = sc.nextInt();
		return (float) a / b;
	}
}
