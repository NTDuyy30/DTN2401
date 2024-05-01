package fontend;

public class Ex3Q4 {
	public static void main(String[] args) {
		Integer[] intArr = { 1, 2, 3 };
		Float[] flArr = { 1f, 2f, 3f };
		Long[] lArr = { 1l, 2l, 3l };
		Double[] dArr = { 1d, 2d, 3d };

		print(intArr);
		print(flArr);
		print(lArr);
		print(dArr);
	}

	public static <E> void print(E[] arr) {
		for (E e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
