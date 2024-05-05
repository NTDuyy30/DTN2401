package com.vti.entiy;

public class Candidate {
	public enum Category {
		EXPERIENCECANDIDATE, FRESHERCANDIDATE;
	}

	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;
	protected Category category;

	public Candidate() {

	}

	public Candidate(String firstName, String lastName, String phone, String email, String password,
			Category category) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.category = category;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", category=" + category + "]";
	}

}
