package fontend.exercise2;

import java.util.Scanner;

public class Question5 {
	public static int inputAge() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			try {
				int b = Integer.parseInt(sc.next());
				if (b > 0) {
					return b;
				} else {
					System.out.println("Enter again with age great than 0");
				}
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
		}
	}

	public static void main(String[] args) {
		inputAge();
	}
}
