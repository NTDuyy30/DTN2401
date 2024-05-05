package com.vti.entiy;

public class Employee extends User {
	public enum ProSkill {
		DEV, TEST, JAVA, SQL;
	}

	private ProSkill proSkill;

	public Employee() {
		super();
	}

	public Employee(int id, String fullname, String email, String password, Role role, ProSkill proSkill) {
		super(id, fullname, email, password, role);
		this.proSkill = proSkill;
	}

	public Employee(String fullname, String email, ProSkill proSkill) {
		super(fullname, email);
		this.proSkill = proSkill;
	}

	public Employee(String fullname, String email) {
		super(fullname, email);
	}

	public ProSkill getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkill proSkill) {
		this.proSkill = proSkill;
	}

}
