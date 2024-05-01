package fontend;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import entity.Student;

public class Question6Ex1 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<Integer, String>();

		Student st3 = new Student("Duy");
		Student st4 = new Student("Đạt");
		Student st5 = new Student("Khải");

		students.put(st3.getId(), st3.getName());
		students.put(st4.getId(), st4.getName());
		students.put(st5.getId(), st5.getName());

		System.out.println("Danh sách students");
		for (Entry<Integer, String> m : students.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("\nDanh sách keys");
		for (Entry<Integer, String> m : students.entrySet()) {
			System.out.println(m.getKey());
		}

		System.out.println("\nDanh sách values");
		for (Entry<Integer, String> m : students.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}
