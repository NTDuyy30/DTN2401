package fontend.exercise2;

public class Question1_2 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 5);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide 0");
		} finally {
			System.out.println("divide completed!");
		}
	}

	public static float divide(int a, int b) {
		return a / b;
	}
}
