package fontend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question5Ex1 {
	public static void main(String[] args) {
		List<String> setName = new ArrayList<String>();
		setName.add("Duy");
		setName.add("Đạt");
		setName.add("Giang");

		Collections.sort(setName);

		Iterator<String> iteName = setName.iterator();
		for (int i = 0; i < setName.size(); i++) {
			System.out.println(iteName.next());
		}
	}
}
