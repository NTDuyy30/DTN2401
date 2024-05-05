package com.vti.entiy;

public class Manager extends Account {
	private byte expInYear;

	public Manager() {
		super();
	}

	public Manager(int id, String fullname, String email, String password, Category category, Project project,
			byte expInYear) {
		super(id, fullname, email, password, category, project);
		this.expInYear = expInYear;
	}

	public byte getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(byte expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [expInYear=" + expInYear + ", toString()=" + super.toString() + "]";
	}

}
