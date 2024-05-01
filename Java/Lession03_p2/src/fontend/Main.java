package fontend;

import java.util.Random;

import backend.Exercise_1;

public class Main {
	public static void main(String[] args) {
		Exercise_1 ex1 = new Exercise_1();

//		Question 1
		ex1.question1();

//		Question 2 
		System.out.println("\nQuestion 2");
		Random rand = new Random(); // Tạo một số ngẫu nhiên từ 0 đến 99999
		int randomNumber = rand.nextInt(100000); // Định dạng số để có đủ 5 chữ số,
//		thêm số 0 ở đầu nếu cần
		System.out.printf("Số ngẫu nhiên có 5 chữ số: %05d%n", randomNumber);

		String formattedNumber = String.format("%05d", randomNumber);
		System.out.println("Số ngẫu nhiên có 5 chữ số: " + formattedNumber);

//		Question 3 
		System.out.println("\nQuestion 3");
		System.out.println(randomNumber % 100);

//		Question 4
		System.out.println("Thương = " + ex1.question4());
	}
}
