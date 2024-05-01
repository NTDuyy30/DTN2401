package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Exercise1 {
	public void question1() {
		Department dep1 = new Department();
		dep1.setDepartmentID(1);
		dep1.setDepartmentName("Marketing");
		Department dep2 = new Department("Dev");
		System.out.println(dep1);
		System.out.println(dep2);
	}

	public void question2() {
		Account acc1 = new Account();
		acc1.setAccountID(1);
		acc1.setEmail("a@gmail.com");
		acc1.setUsername("user1");
		acc1.setFullname("Hoang Dinh");
		Account acc2 = new Account(2, "b@gmail.com", "user2", "Duy", "Nguyen");
		Account acc3 = new Account(3, "c@gmail.com", "user3", "Giang", "Nguyen", new Position(1, PositionName.DEV));
		Account acc4 = new Account(4, "d@gmail.com", "user4", "Hieu", "Nguyen", new Position(2, PositionName.PM),
				LocalDate.of(2025, 01, 14));

		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println(acc4);
	}

	public void question3() {
		Group g1 = new Group();

		Account acc1 = new Account(1, "b@gmail.com", "user1", "Duy", "Nguyen");
		Account acc2 = new Account(2, "c@gmail.com", "user2", "Giang", "Nguyen", new Position(1, PositionName.DEV));
		Account acc3 = new Account(3, "d@gmail.com", "user3", "Hieu", "Nguyen", new Position(2, PositionName.PM),
				LocalDate.of(2025, 01, 14));
		Account[] arrAcc = { acc1, acc2, acc3 };
		Group g2 = new Group("Group 1", acc1, arrAcc, LocalDate.now());

		Group g3 = new Group("Group 2", acc2, new String[] { "Duy", "Giang", "Hieu" }, LocalDate.now());

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}
}
