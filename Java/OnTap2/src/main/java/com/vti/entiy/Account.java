package com.vti.entiy;

public class Account {
	public enum Category {
		MANAGER, EMPLOYEE;
	}

	private int id;
	private String fullname;
	private String email;
	private String password;
	private Category category;
	private Project project;

	public Account() {

	}

	public Account(int id, String fullname, String email, String password, Category category, Project project) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.category = category;
		this.project = project;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", category=" + category + ", project=" + project + "]";
	}

}
