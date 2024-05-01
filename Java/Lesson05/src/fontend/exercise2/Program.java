package fontend.exercise2;

import java.util.ArrayList;
import java.util.List;

import entity.exercise2.question1.Student;

public class Program {
	public static void main(String[] args) {
//		Tạo 10 học sinh, chia thành 3 nhóm
		List<Student> listStu = new ArrayList<>();
		listStu.add(new Student(1, "student 1", 1));
		listStu.add(new Student(2, "student 2", 1));
		listStu.add(new Student(3, "student 3", 1));
		listStu.add(new Student(4, "student 4", 2));
		listStu.add(new Student(5, "student 5", 2));
		listStu.add(new Student(6, "student 6", 2));
		listStu.add(new Student(7, "student 7", 3));
		listStu.add(new Student(8, "student 8", 3));
		listStu.add(new Student(9, "student 9", 3));
		listStu.add(new Student(10, "student 10", 3));

//		Kêu gọi cả lớp điểm danh.
		System.out.println("Kêu gọi cả lớp điểm danh");
		for (Student s : listStu) {
			s.diemDanh();
		}

//		Gọi nhóm 1 đi học bài
		System.out.println("\nGọi nhóm 1 đi học bài");
		for (Student s : listStu) {
			if (s.getGroup() == 1) {
				s.hocBai();
			}
		}

//		Gọi nhóm 2 đi dọn vệ sinh
		System.out.println("\nGọi nhóm 2 đi dọn vệ sinh");
		for (Student s : listStu) {
			if (s.getGroup() == 2) {
				s.diDonVeSinh();
			}
		}
	}
}
