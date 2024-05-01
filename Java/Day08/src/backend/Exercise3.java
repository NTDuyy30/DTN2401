package backend;

import java.util.Scanner;

import utils.FileUtils;

public class Exercise3 {
	public void question1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path: ");
		String path = sc.nextLine();
		if (FileUtils.isFileExists(path)) {
			System.out.println("File is exists");
		} else {
			System.out.println("File is not exists");
		}
	}

	public void question2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path: ");
		String path = sc.nextLine();
		try {
			FileUtils.createNewFile(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
