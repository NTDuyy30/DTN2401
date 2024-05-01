package com.vti.entity;

public class Account2 {
//	Properties
	private String id;
	private String name;
	private int balance;

//	Constructor
	public Account2(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

//	Method get
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

//	Method other
	public int credit(int amount) {
		return this.balance += amount;
	}

	public int debit(int amount) {
		return this.balance -= amount;
	}

	public void tranfer(Account2 acc, int amount) {
		this.balance -= amount;
		acc.balance += amount;
	}

}
