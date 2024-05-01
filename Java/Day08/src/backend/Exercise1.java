package backend;

import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class Exercise1 {
	private static List<Student> listStu = new ArrayList<>();

	public void question1() {
		Student st1 = new Student(1, "Nguyễn Văn A");
		Student st2 = new Student(2, "Nguyễn Văn B");
		Student st3 = new Student(3, "Nguyễn Văn C");
		Student.college = "Đại học bách khoa";

		listStu.add(st1);
		listStu.add(st2);
		listStu.add(st3);

		for (Student s : listStu) {
			System.out.println(s);
			System.out.println(Student.college);
		}

		Student.college = "Đại học công nghệ";

		for (Student s : listStu) {
			System.out.println(s);
			System.out.println(Student.college);
		}
	}

	public void question2() {
		System.out.println("Bước 1: Các Student sẽ nộp quỹ, mỗi Student 100k");
		Student.moneyGroup = listStu.size() * 100;
		System.out.printf("Tiền quỹ: %.0fk%n", Student.moneyGroup);

		System.out.println("Bước 2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		Student.moneyGroup -= 50;
		System.out.printf("Tiền quỹ: %.0fk%n", Student.moneyGroup);

		System.out.println("Bước 3: Student thứ 2 lấy 20k đi mua bánh mì");
		Student.moneyGroup -= 20;
		System.out.printf("Tiền quỹ: %.0fk%n", Student.moneyGroup);

		System.out.println("Bước 4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		Student.moneyGroup -= 150;
		System.out.printf("Tiền quỹ: %.0fk%n", Student.moneyGroup);

		System.out.println("Bước 5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		Student.moneyGroup += listStu.size() * 50;
		System.out.printf("Tiền quỹ: %.0fk%n", Student.moneyGroup);
	}
}
