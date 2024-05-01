package fontend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question2Ex1 {
	public static void main(String[] args) {
		Stack<String> stackstu = new Stack<String>();
		stackstu.push("Nguyễn Văn A");
		stackstu.push("Trần Văn Nam");
		stackstu.push("Nguyễn Văn Huyên");
		stackstu.push("Nguyễn Văn Nam");

		int size = stackstu.size();
		for (int i = 0; i < size; i++) {
			System.out.println(stackstu.pop());
		}

		Queue<String> queueStu = new LinkedList<String>();
		queueStu.add("Nguyễn Văn Nam");
		queueStu.add("Nguyễn Văn Huyên");
		queueStu.add("Trần Văn Nam");
		queueStu.add("Nguyễn Văn A");

		int size2 = queueStu.size();
		for (int i = 0; i < size2; i++) {
			System.out.println(queueStu.poll());
		}
	}
}
