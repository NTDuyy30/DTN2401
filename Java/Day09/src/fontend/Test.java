package fontend;

import java.time.LocalDate;

import entity.Student;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student("Duy", LocalDate.of(2002, 11, 14), 9f);
		Student st2 = new Student("Duz", LocalDate.of(2002, 11, 14), 10f);
		System.out.println(st1.compareTo(st2));
	}
}
