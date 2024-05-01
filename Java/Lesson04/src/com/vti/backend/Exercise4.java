package com.vti.backend;

import com.vti.entity.Student;

public class Exercise4 {
	public void question1() {
		Student st1 = new Student("Duy", "TN");
		st1.setDiem(10);
		Student st2 = new Student("Khải", "HN");
		st2.setDiem(7);
		Student st3 = new Student("Tú", "NB");
		st3.setDiem(2.5f);
		st3.congDiem(1.4f);

		st1.showInforStu();
		st2.showInforStu();
		st3.showInforStu();
	}

	public void question2() {

	}
}
