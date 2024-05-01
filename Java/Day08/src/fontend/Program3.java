package fontend;

import java.util.Scanner;

import backend.Exercise3;

public class Program3 {
	public static void main(String[] args) {
		Exercise3 ex3 = new Exercise3();
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			System.out.print("Enter your choice: ");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				ex3.question1();
				break;
			case 2:
				ex3.question2();
				break;
			case 3:
//				qlcb.printListCanBo();
				break;
			case 4:
//				qlcb.deleteCanBo();
				break;
			case 5:
				return;
			default:
				System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 tới 5 thôi!");
				break;
			}
		}
	}

	public static void menu() {
		System.out.println("\n===================================Enter question==================================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Question 1");
		System.out.format(leftAlignFormat, "2. Question 2");
		System.out.format(leftAlignFormat, "3. Question 3");
		System.out.format(leftAlignFormat, "4. ");
		System.out.format(leftAlignFormat, "5. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}
