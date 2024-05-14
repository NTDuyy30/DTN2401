package com.vti.entiy;

public class Manager extends User {
	private byte expInYear;

	public Manager() {
		super();
	}

	public Manager(int id, String fullname, String email, Role role, byte expInYear, int projectId) {
		super(id, fullname, email, role, projectId);
		this.expInYear = expInYear;
	}
	
	public Manager(int id, String fullname, String email) {
		super(id, fullname, email);
	}

	public byte getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(byte expInYear) {
		this.expInYear = expInYear;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

}
