package entity;

public class Employees /* implements Comparable<Employees> */ {
	private int employeeId;
	private String employeeName;

	public Employees() {

	}

	public Employees(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

//	@Override 
//	public int compareTo(Employees o) { 
//		// return this.employeeId <
//		 o.employeeId ? 1 : (this.employeeId > o.employeeId ? -1 : 0); 
//		if (this.employeeId < o.employeeId) { 
//			return -1; 
//		} else if (this.employeeId > o.employeeId) { 
//			return 1; 
//		} 
//			return 0;
//	}

	@Override
	public String toString() {
		System.out.printf("%-5d %-15s%n", this.employeeId, this.employeeName);
		return null;
	}

}
