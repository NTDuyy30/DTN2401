package fontend.exercise1;

import java.util.Scanner;

import backend.TuyenSinh;
import entity.exercise1.ITuyenSinh;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ITuyenSinh ts = new TuyenSinh();
		byte choice = -1;
		while (true) {
			TuyenSinh.menu();
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				ts.themTS();
				break;
			case 2:
				ts.hienThiTS();
				break;
			case 3:
				ts.timKiemTS();
				break;
			case 4:
				ts.xoaTS();
				break;
			case 5:
				return;
			default:
				System.out.println("Mời bạn nhập lại trong khoảng 1 - 4");
			}
		}

	}
}
