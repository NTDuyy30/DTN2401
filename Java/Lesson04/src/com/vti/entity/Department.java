package com.vti.entity;

public class Department {
	private int departmentID;
	private String departmentName;

	public Department() {

	}

	public Department(String nameDepartment) {
		this.departmentID = 0;
		this.departmentName = nameDepartment;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

}
