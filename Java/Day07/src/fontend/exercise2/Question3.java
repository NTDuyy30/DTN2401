package fontend.exercise2;

public class Question3 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		try {
			System.out.println(numbers[10]);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Index out of bounts");
		}
	}
}
