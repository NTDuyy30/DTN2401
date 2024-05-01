package entity;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	public static int COUNT = 1;
	private int id;
	private String name;
	private LocalDate dob;
	private float score;

	public Student() {

	}

	public Student(String name, LocalDate dob, float score) {
		this.id = COUNT++;
		this.name = name;
		this.dob = dob;
		this.score = score;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getPoint() {
		return score;
	}

	public void setPoint(float score) {
		this.score = score;
	}

	public Student(String name) {
		this.id = COUNT++;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		int result = this.name.compareTo(o.name);
		if (result == 0) {
			result = this.dob.compareTo(o.dob);
			if (result == 0) {
				if (this.score > o.score)
					return 1;
				else if (this.score < o.score)
					return -1;
				return 0;
			} else {
				return result;
			}
		} else {
			return result;
		}
	}
}
