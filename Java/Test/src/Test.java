import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhập vào số thứ 1: ");
			int a = sc.nextInt();
			System.out.println("Nhập vào số thứ 2: ");
			int b = sc.nextInt();
			System.out.println("Kết quả phép chia 2 số là: " + a / b);
			int[] arr = { 1, 2 };
			arr[4] = 10;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
