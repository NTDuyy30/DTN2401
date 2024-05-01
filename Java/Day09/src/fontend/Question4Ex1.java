package fontend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question4Ex1 {
	public static void main(String[] args) {
		Set<String> setName = new HashSet<String>();
		setName.add("Duy");
		setName.add("Đạt");
		setName.add("Giang");

		Iterator<String> iteName = setName.iterator();
		for (int i = 0; i < setName.size(); i++) {
			System.out.println(iteName.next());
		}
	}
}
