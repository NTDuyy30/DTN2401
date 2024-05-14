package com.vti.entiy;

public class User {
	public enum Role {
		EMPLOYEE, MANAGER
	}

	protected int id;
	protected String fullname;
	protected String email;
	protected String password;
	protected Role role;
	protected int projectId;

	public User() {

	}

	public User(int id, String fullname, String email, Role role, int projectId) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.role = role;
		this.projectId = projectId;
	}

	public User(int id, String fullname, String email) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
	}

	public User(String fullname, String email) {
		this.fullname = fullname;
		this.email = email;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
