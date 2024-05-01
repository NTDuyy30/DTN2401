package fontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class Question2Ex2 {
	public static List<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		Student st1 = new Student("Hồng", LocalDate.of(2002, 11, 14), 9f);
		Student st2 = new Student("Duy", LocalDate.of(2002, 11, 14), 10f);
		Student st3 = new Student("Phương", LocalDate.now(), 8f);
		Student st4 = new Student("Đạt", LocalDate.of(2002, 11, 13), 10f);
		Student st5 = new Student("Khải", LocalDate.of(2002, 11, 12), 10f);
		Student st6 = new Student("Đạt", LocalDate.of(2002, 11, 13), 5f);

		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		students.add(st6);

		System.out.println("Danh sách sinh viên");
		for (Student s : students) {
			System.out.println(s);
		}

		Collections.sort(students);

		System.out.println("\nDanh sách sinh viên");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
