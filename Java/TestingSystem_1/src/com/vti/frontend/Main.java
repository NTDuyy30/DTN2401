package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise_5;
import com.vti.backend.Exercise_6;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		byte choice = -1;
		while (true) {
			System.out.println("---------------Mời bạn chọn Exercise muốn xem---------------");
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                               Choose please                              |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Exercise 5");
			System.out.format(leftAlignFormat, "2. Exercise 6");
			System.out.format(leftAlignFormat, "3. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				System.out.println("Exercise 5: Input from console");
				showMenuEx5();
				break;
			case 2:
				System.out.println("\nExercise 6: Method");
				showMenuEx6();
				break;
			case 3:
				return;
			default:
				System.out.println("!!Mời bạn nhập lại trong khoảng 1 đến 3");
				break;
			}
		}
	}

	private static void showMenuEx5() {
		Exercise_5 ex = new Exercise_5();
		byte choice = -1;
		while (true) {
			System.out.println("---------------Mời bạn chọn Question muốn xem---------------");
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                               Choose please                              |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Question 1");
			System.out.format(leftAlignFormat, "2. Question 2");
			System.out.format(leftAlignFormat, "3. Question 3");
			System.out.format(leftAlignFormat, "4. Question 4");
			System.out.format(leftAlignFormat, "5. Question 5");
			System.out.format(leftAlignFormat, "6. Question 6");
			System.out.format(leftAlignFormat, "7. Question 7");
			System.out.format(leftAlignFormat, "8. Question 8");
			System.out.format(leftAlignFormat, "9. Question 9");
			System.out.format(leftAlignFormat, "10. Question 10");
			System.out.format(leftAlignFormat, "11. Question 11");
			System.out.format(leftAlignFormat, "12. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				ex.Question1();
				break;
			case 2:
				ex.Question2();
				break;
			case 3:
				ex.Question3();
				break;
			case 4:
				ex.Question4();
				break;
			case 5:
				ex.Question5();
				break;
			case 6:
				ex.Question6();
				break;
			case 7:
				ex.Question7();
				break;
			case 8:
				ex.Question8();
				break;
			case 9:
				ex.Question9();
				break;
			case 10:
				ex.Question10();
				break;
			case 11:
				ex.Question11();
				break;
			case 12:
				return;
			default:
				System.out.println("!!Mời bạn nhập lại trong khoảng 1 đến 4");
				break;
			}
		}
	}

	private static void showMenuEx6() {
		Exercise_6 ex = new Exercise_6();
		byte choice = -1;
		while (true) {
			System.out.println("---------------Mời bạn chọn Question muốn xem---------------");
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                               Choose please                              |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Question 1");
			System.out.format(leftAlignFormat, "2. Question 2");
			System.out.format(leftAlignFormat, "3. Question 3");
			System.out.format(leftAlignFormat, "4. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				System.out.println("Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10");
				ex.printPositiveEvenIntegerLessThan10();
				break;
			case 2:
				System.out.println("\n\nQuestion 2: Tạo method để in thông tin các account");
				ex.printAccount();
				break;
			case 3:
				System.out.println("\nQuestion 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10");
				ex.printPositiveIntegerLessThan10();
				break;
			case 4:
				return;
			default:
				System.out.println("!!Mời bạn nhập lại trong khoảng 1 đến 4");
				break;
			}
		}
	}
}
