package fontend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import backend.utils.ScannerUtils;
import entity.Student;

public class Question1Ex1 {
	public static List<Student> students = new ArrayList<Student>();
	public static List<Student> studentCopies = new ArrayList<Student>();

	public static void main(String[] args) {
		Student st1 = new Student("Duy");
		Student st2 = new Student("Duy");
		Student st3 = new Student("Duy");
		Student st4 = new Student("Đạt");
		Student st5 = new Student("Khải");
		Student st6 = new Student("Đạt");

		Student st7 = new Student("Giang");
		Student st8 = new Student("Hiếu");

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

		System.out.println("Tổng số phần tử students: " + students.size());
		System.out.println("Phần tử thứ 4 của students: " + students.get(3));
		System.out.println("Phần tử đầu: " + students.get(0));
		System.out.println("Phần tử cuối: " + students.get(students.size() - 1));

		students.add(0, st7);
		students.add(st8);

		System.out.println("Danh sách sinh viên");
		for (Student s : students) {
			System.out.println(s);
		}

		Collections.reverse(students);

		System.out.println("Danh sách sinh viên");
		for (Student s : students) {
			System.out.println(s);
		}

//		searchStudentById();
//
		for (Student s : searchStudentByName()) {
			System.out.println(s);
		}

//		showStuSameName();

//		deleteName();
//		System.out.println("Danh sách sinh viên");
//		for (Student s : students) {
//			System.out.println(s);
//		}
//		deleteStudent();
//		System.out.println("Danh sách sinh viên");
//		for (Student s : students) {
//			System.out.println(s);
//		}

		copy();
		System.out.println("Danh sách sinh viên");
		for (Student s : studentCopies) {
			System.out.println(s);
		}
	}

	public static void searchStudentById() {
		int id = ScannerUtils.inputIntPositive();
		for (Student s : students) {
			if (s.getId() == id)
				System.out.println(s);
		}
	}

	public static List<Student> searchStudentByName() {
		String name = ScannerUtils.inputName("\nNhập name của student muốn tìm: ");
		List<Student> list = new ArrayList<Student>();
		for (Student s : students) {
			if (s.getName().equals(name))
				list.add(s);
		}
		return list;
	}

	public static void showStuSameName() {
		System.out.println("\nDanh sách student có tên giống nhau là: ");
		for (byte i = 0; i < students.size() - 1; i++) {
			for (byte j = (byte) (i + 1); j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println(students.get(i));
				}
			}
		}
	}

	public static void deleteName() {
		for (Student s : students) {
			if (s.getId() == 2) {
				s.setName(null);
			}
		}
	}

	public static void deleteStudent() {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == 5) {
				students.remove(i);
			}
		}
	}

	public static void copy() {
		studentCopies.addAll(students);
	}
}
