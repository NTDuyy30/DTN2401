package fontend;

import java.util.ArrayList;
import java.util.List;

import entity.generic.Employee;

public class Ex3Q5 {
	public static void main(String[] args) {
//		Integer[] intArr = { 300, 400, 500 };
//		Employee<Integer> emp1 = new Employee<Integer>(1, "Duy", intArr);

//		Long[] longArr = { 300l, 400l, 500l };
//		Employee<Long> emp2 = new Employee<Long>(2, "Hà", longArr);
//
//		Float[] floatArr = { 300f, 400f, 500f };
//		Employee<Float> emp3 = new Employee<Float>(3, "Hồng", floatArr);

//		emp1.showInfor();
//		emp1.showLastMonthSalary();
//		emp2.showInfor();
//		emp2.showLastMonthSalary();
//		emp3.showInfor();
//		emp3.showLastMonthSalary();

		List<Integer> intArr = new ArrayList<Integer>();
		intArr.add(300);
		intArr.add(400);
		intArr.add(500);
		Employee<Integer> emp1 = new Employee<Integer>(1, "Duy", intArr);
		emp1.showInfor();
		emp1.showLastMonthSalary();

	}
}
