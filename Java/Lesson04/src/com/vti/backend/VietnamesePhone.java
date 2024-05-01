package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.exercise6.Contact;
import com.vti.entity.exercise6.Phone;

public class VietnamesePhone extends Phone {
	private List<Contact> list;

	public VietnamesePhone() {
		list = new ArrayList<>();
	}

	@Override
	public void showContacts() {
		for (Contact c : list) {
			System.out.println(c);
		}
	}

	@Override
	public void insertContact(String name, String number) {
		Contact c = new Contact(name, number);
		list.add(c);
	}

	@Override
	public void removeContact(String name) {
		list.removeIf(Contact -> Contact.getName().equals(name));
	}

	@Override
	public void updateContact(String name, String newNumber) {
		for (Contact c : list) {
			if (c.getName().equals(name)) {
				c.setNumber(newNumber);
			}
		}
	}

	@Override
	public void searchContact(String name) {
		for (Contact c : list) {
			if (c.getName().equals(name)) {
				System.out.println(c);
			}
		}
	}

	public void menu() {
		System.out.println("\n===============================Quản lý liên hệ===============================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Mời bạn chọn                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Thêm mới liên hệ");
		System.out.format(leftAlignFormat, "2. Xóa liên hệ");
		System.out.format(leftAlignFormat, "3. Cập nhật liên hệ");
		System.out.format(leftAlignFormat, "4. Tìm kiếm liên hệ");
		System.out.format(leftAlignFormat, "5. Hiển thị danh sách liên hệ");
		System.out.format(leftAlignFormat, "6. Thoát khỏi chương trình");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}

}
