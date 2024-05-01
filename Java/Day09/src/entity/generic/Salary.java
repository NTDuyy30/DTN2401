package entity.generic;

public class Salary<N extends Number> {
	private N salary;

	public Salary(N salary) {
		this.salary = salary;
	}

	public void getSalary() {
		System.out.println(this.salary);
	}
}
