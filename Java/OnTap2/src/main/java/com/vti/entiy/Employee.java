package com.vti.entiy;

public class Employee extends Account {
	public enum ProSkill {
		DEV, TEST, JAVA, SQL;
	}

	private ProSkill proSkill;

	public Employee() {
		super();
	}

	public Employee(int id, String fullname, String email, String password, Category category, Project project,
			ProSkill proSkill) {
		super(id, fullname, email, password, category, project);
		this.proSkill = proSkill;
	}

	public ProSkill getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkill proSkill) {
		this.proSkill = proSkill;
	}

}
