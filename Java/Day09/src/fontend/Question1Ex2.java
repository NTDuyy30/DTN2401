package fontend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Student;

public class Question1Ex2 {
	public static List<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		Student st1 = new Student("Duy");
		Student st2 = new Student("Hồng");
		Student st3 = new Student("Phương");
		Student st4 = new Student("Đạt");
		Student st5 = new Student("Khải");
		Student st6 = new Student("Đạt");

		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		students.add(st6);

//		Collections.sort(students);

		Iterator<Student> iteStu = students.iterator();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(iteStu.next());
		}
	}
}
