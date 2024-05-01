package entity.exercise2.question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	public enum Gender {
		MALE, FEMALE, UNKNOW;
	}

//	Properties
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private String address;

//	Constructor
	public Person() {

	}

	public Person(String name, Gender gender, LocalDate dateOfBirth, String address) {
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

//	Method get, set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	method other
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================Enter person information==============================");
		System.out.print("Enter person name: ");
		this.name = sc.nextLine();

		byte gender = -1;
		do {
			System.out.println("Enter person gender");
			System.out.println("1. MALE");
			System.out.println("2. FEMALE");
			System.out.println("3. UNKNOW");
			gender = sc.nextByte();
			switch (gender) {
			case 1:
				this.gender = Gender.MALE;
				break;
			case 2:
				this.gender = Gender.FEMALE;
				break;
			case 3:
				this.gender = Gender.UNKNOW;
				break;
			default:
				System.out.println("Please re-enter between 1 and 3");
			}
		} while (!(gender >= 1 && gender <= 3));

		System.out.println("Enter date of birth");
		System.out.print("\tEnter day of birth: ");
		int day = sc.nextInt();
		System.out.print("\tEnter month of birth: ");
		int month = sc.nextInt();
		System.out.print("\tEnter year of birth: ");
		int year = sc.nextInt();
		this.dateOfBirth = LocalDate.of(year, month, day);

		System.out.print("Enter person address: ");
		sc.nextLine();
		this.address = sc.nextLine();
	}

	public void showInfo() {
		System.out.println("==============================Person Information==============================");
		System.out.printf("%15s %15s %15s %15s%n", "Name", "Gender", "DOB", "Address");
		System.out.printf("%15s %15s %15s %15s%n", this.name, this.gender, this.dateOfBirth, this.address);
	}
}
