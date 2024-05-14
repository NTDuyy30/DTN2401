package com.vti.entiy;

public class Employee extends User {
	public enum ProSkill {
		DEV, TEST, JAVA, SQL;
	}

	private ProSkill proSkill;

	public Employee() {
		super();
	}

	public Employee(int id, String fullname, String email, Role role, ProSkill proSkill, int projectId) {
		super(id, fullname, email, role, projectId);
		this.proSkill = proSkill;
	}

	public Employee(String fullname, String email, ProSkill proSkill, int projectId) {
		super(fullname, email);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}

	public Employee(int id, String fullname, String email) {
		super(id, fullname, email);
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public ProSkill getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkill proSkill) {
		this.proSkill = proSkill;
	}

}
