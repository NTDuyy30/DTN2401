package fontend;

import backend.utils.ScannerUtils;
import entity.generic.Student;

public class Ex3Question1 {
	public static void main(String[] args) {
		Student<Integer> st1 = new Student<Integer>(1, "Duy");
		Student<Float> st2 = new Student<Float>(2f, "Giang");
		Student<Double> st3 = new Student<Double>(3d, "Nho");

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);

		String name = ScannerUtils.inputName("Enter student name: ");
		print(name);
		print(st1);
		print(4);
		print(4.0);
	}

	public static <T> void print(T a) {
		System.out.println(a);
	}
}
