package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diem;

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diem = 0;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	public void congDiem(float diemCong) {
		this.diem += diemCong;
	}

	public void showInforStu() {
		System.out.println("Tên: " + this.name);
		System.out.println("Điểm: " + this.diem);
		if (this.diem < 4) {
			System.out.println("\t => Yếu");
		} else if (this.diem >= 4 && this.diem < 6) {
			System.out.println("\t => Trung bình");
		} else if (this.diem >= 6 && this.diem < 8) {
			System.out.println("\t => Khá");
		} else {
			System.out.println("\t => Giỏi");
		}
	}

}
