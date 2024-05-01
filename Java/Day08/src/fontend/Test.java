package fontend;

import utils.FileUtils;
import utils.ScannerUtils;

public class Test {
	public static void main(String[] args) {
		System.out.print("Enter source file: ");
		String sourceFile = ScannerUtils.inputString("No blank!!!");
		try {
			;
			FileUtils.writeFile(sourceFile, true, " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
