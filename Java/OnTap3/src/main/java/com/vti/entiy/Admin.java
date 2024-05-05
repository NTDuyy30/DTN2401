package com.vti.entiy;

public class Admin extends User {
	private byte expInYear;

	public Admin() {
		super();
	}

	public Admin(int id, String fullname, String email, String password, Role role, byte expInYear) {
		super(id, fullname, email, password, role);
		this.expInYear = expInYear;
	}

	public byte getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(byte expInYear) {
		this.expInYear = expInYear;
	}

}
