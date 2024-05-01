package fontend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import backend.utils.ScannerUtils;
import entity.Student;

public class Question3Ex1 {
	public static Set<Student> students = new HashSet<Student>();

	public static void main(String[] args) {
		Student st1 = new Student("Duy");
		Student st2 = new Student("Duy");
		Student st3 = new Student("Duy");
		Student st4 = new Student("Đạt");
		Student st5 = new Student("Khải");
		Student st6 = new Student("Đạt");
		students.add(st1);
		students.add(st3);
		students.add(st2);
		students.add(st5);
		students.add(st4);
		students.add(st6);

		System.out.println("Danh sách sinh viên");
		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("Tổng số phần tử students: " + students.size());
		Iterator<Student> iteSet = students.iterator();
		for (int i = 0; i <= 2; i++) {
			iteSet.next();
		}
		System.out.println("Phần tử thứ 4 của students: " + iteSet.next());

		Iterator<Student> iteSet2 = students.iterator();
		System.out.println("Phần tử đầu: " + iteSet2.next());
		for (int i = 0; i < students.size() - 2; i++) {
			iteSet2.next();
		}
		System.out.println("Phần tử cuối: " + iteSet2.next());

	}

	public static void searchStudentById() {
		int id = ScannerUtils.inputIntPositive();
		for (Student s : students) {
			if (s.getId() == id)
				System.out.println(s);
		}
	}

	public static void searchStudentByName() {
		String name = ScannerUtils.inputName("\nNhập name của student muốn tìm: ");
		for (Student s : students) {
			if (s.getName().equals(name))
				System.out.println(s);
		}
	}

}
