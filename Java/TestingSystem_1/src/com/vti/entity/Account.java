package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int accountID;
	public String email;
	public String username;
	public String fullname;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", username=" + username + ", fullname="
				+ fullname + ", department=" + department.departmentName + ", position=" + position.positionName
				+ ", createDate=" + createDate + "]";
	}
}
