package com.vti.fontend;

import java.util.Scanner;

import com.vti.backend.VietnamesePhone;

public class Project6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VietnamesePhone vnp = new VietnamesePhone();
		byte choice = -1;
		while (true) {
			vnp.menu();
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				System.out.println("Mời bạn nhập liên hệ mới");
				System.out.print("\tTên liên hệ: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("\tSố điện thoại liên hệ: ");
				String number = sc.nextLine();
				vnp.insertContact(name, number);
				break;
			case 2:
				System.out.print("Mời bạn nhập tên liên hệ muốn xóa: ");
				sc.nextLine();
				String delName = sc.nextLine();
				vnp.removeContact(delName);
				break;
			case 3:
				System.out.print("Mời bạn nhập tên liên hệ muốn sửa: ");
				sc.nextLine();
				String updateName = sc.nextLine();
				System.out.print("Số điện thoại mới: ");
				String newUpNumber = sc.nextLine();
				vnp.updateContact(updateName, newUpNumber);
				break;
			case 4:
				System.out.print("Mời bạn nhập tên liên hệ muốn tìm: ");
				sc.nextLine();
				String searchName = sc.nextLine();
				vnp.searchContact(searchName);
				break;
			case 5:
				vnp.showContacts();
				break;
			case 6:
				return;
			default:
				System.out.println("Mời bạn nhập lại trong khoảng 1 - 5");
			}
		}
	}
}
