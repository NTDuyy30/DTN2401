package com.vti.fontend;

import java.util.Scanner;

import com.vti.backend.QLCB;

public class Project5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		byte choice = -1;
		while (true) {
			qlcb.menu();
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				qlcb.themCB();
				break;
			case 2:
				qlcb.timKiemTheoTen();
				break;
			case 3:
				qlcb.hienThiDanhSach();
				break;
			case 4:
				qlcb.xoaCB();
				break;
			case 5:
				return;
			default:
				System.out.println("Mời bạn nhập lại trong khoảng 1 - 5");
			}
		}
	}
}
