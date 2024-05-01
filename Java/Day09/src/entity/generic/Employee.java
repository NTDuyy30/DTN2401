package entity.generic;

import java.util.List;

public class Employee<E> {
	private int id;
	private String name;
	private List<E> salaries;

	public Employee() {

	}

	public Employee(int id, String name, List<E> salaries) {
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}

	public void showInfor() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salaries");
		for (E e : this.salaries) {
			System.out.println("\t" + e);
		}
	}

	public void showLastMonthSalary() {
//		System.out.println("The last month salary: " + this.salaries[this.salaries.length - 1]);
		System.out.println("The last month salary: " + this.salaries.get(this.salaries.size() - 1));
	}
}
