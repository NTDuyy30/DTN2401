package com.vti.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputId(String msg) {
		while (true) {
			System.out.println(msg);
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}
			// else
			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}

	public static String inputName(String msg) {
//		Pattern VALID_NAME_REGEX = Pattern.compile("^[a-z\\\\s]+", Pattern.CASE_INSENSITIVE);
		Pattern VALID_NAME_REGEX = Pattern.compile("^[a-zA-Z ]*$");

		while (true) {
			System.out.println(msg);
			String name = inputString("You cannot leave it blank");
			Matcher matcher = VALID_NAME_REGEX.matcher(name);

			if (matcher.matches()) {
				return name;
			} else {
				System.out.println("Name is not in correct format. Please enter again");
			}
		}
	}

	public static int inputInt() {
		return inputInt("Please input a number as int, please input again");
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");

			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}

	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();

			if (age >= 18) {
				return age;

			} else {
				System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}

	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositive = Integer.parseInt(scanner.next());
				if (intPositive > 0) {
					return intPositive;
				} else {
					System.err.println(
							"Please input as int positive which must be greater than > 0, please input again.");
				}

			} catch (Exception e) {
				System.err.println("Please input as int positive, please input again.");
			}

		}
	}

	public static LocalDate inputLocalDate() {
		System.out.println("Nhập theo định dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String localdate = scanner.next().trim();
			try {
				if (format.parse(localdate) != null) {
					LocalDate lc = LocalDate.parse(localdate);
					return lc;
				}
			} catch (Exception e) {
				System.err.println("Nhập lại:");
			}

		}
	}

	public static String inputEmail() {
		System.out.println("Input email: ");
		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher;
		while (true) {
			String emailStr = inputString("You cannot leave it blank");
			matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
			if (!matcher.matches()) {
				System.out.println("Email is not in correct format. Please enter again: ");
			} else {
				return emailStr;
			}
		}
	}

	public static int inputFunction(int a, int b, String errorMessage) {
		while (true) {
			int number = inputInt();
			if (number >= a && number <= b) {
				return number;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputPassword() {
		System.out.println("Input password: ");
		while (true) {
			String password = inputString("You cannot leave it blank");
			if (password.length() < 6 || password.length() > 12) {
				System.out.print("Password must be between 6 and 12 characters: ");
				continue;
			}

			return password;
//			boolean hasAtLeast1Character = false;
//
//			for (int i = 0; i < password.length(); i++) {
//				if (Character.isUpperCase(password.charAt(i)) == true) {
//					hasAtLeast1Character = true;
//					break;
//				}
//			}
//			if (hasAtLeast1Character == true) {
//				return password;
//			} else {
//				System.out.print("Password must have at least 1 uppercase character Please input password again.");
//			}
		}
	}

	public static String inputPhoneNumber() {
		while (true) {
			String number = inputString("You cannot leave it blank");
			if (number.length() > 12 || number.length() < 9) {
				continue;
			}

			if (number.charAt(0) != '0') {
				continue;
			}

			boolean isNumber = true;

			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i)) == false) {
					isNumber = false;
					break;
				}
			}
			if (isNumber == true) {
				return number;
			} else {
				System.out.print("Please input phone number again.");
			}

		}
	}
}
