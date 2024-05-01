package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	private int groupID;
	private String groupName;
	private Account creator;
	private LocalDate createDate;
	private Account[] accounts;

	public Group() {
	}

	public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	public Group(String groupName, Account creator, String[] userNames, LocalDate createDate) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = new Account[userNames.length];
		for (int i = 0; i < userNames.length; i++) {
			this.accounts[i] = new Account();
			this.accounts[i].setUsername(userNames[i]);
		}
		this.createDate = createDate;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
