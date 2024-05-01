package fontend;

import entity.generic.Phone;

public class Ex3Q7 {
	public static void main(String[] args) {
		Phone<String, String> p1 = new Phone<String, String>("ntd@gmail.com", "0388063755");
		Phone<Integer, String> p2 = new Phone<Integer, String>(1, "0388063755");
		Phone<String, String> p3 = new Phone<String, String>("Duy", "0388063755");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
