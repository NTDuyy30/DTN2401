package entity;

import java.io.File;

import utils.ScannerUtils;

public class Test {
	public static void main(String[] args) {
		System.out.print("Enter path: ");
		String path = ScannerUtils.inputString("You cannot leave it blank");
		File file = new File(path);
		for (String f : file.list()) {
			System.out.println(f);
		}
	}
}
