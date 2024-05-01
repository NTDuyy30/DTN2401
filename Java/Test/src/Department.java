
public class Department {
	private int id;
	private String name;

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Department d = new Department(1, "Dev");
		System.out.println(d);
	}
}
