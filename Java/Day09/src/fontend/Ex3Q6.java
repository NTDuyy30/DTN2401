package fontend;

import java.util.HashMap;
import java.util.Map;

import entity.generic.MyMap;
import entity.generic.Student;

public class Ex3Q6 {
	public static void main(String[] args) {
		Student<Integer> st = new Student<Integer>(1, "Duy");
		MyMap<Integer, String> student = new MyMap<Integer, String>(st.getId(), st.getName());

		System.out.println(student);

		Map<Integer, String> student2 = new HashMap<Integer, String>();
		student2.put(1, "Duy");
	}
}
