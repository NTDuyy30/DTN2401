package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.presentationlayer.CandidateController;
import com.vti.entiy.Candidate.Category;
import com.vti.entiy.ExperienceCandidate;
import com.vti.entiy.ExperienceCandidate.ProSkill;
import com.vti.entiy.FresherCandidate;
import com.vti.entiy.FresherCandidate.GraduationRank;
import com.vti.utils.ScannerUtils;

public class CandidateFunction {
	public static void inputExpCan() {
		try {
			CandidateController con = new CandidateController();
			String email = null;
			while (true) {
				email = ScannerUtils.inputEmail();
				if (con.isEmailExists(email)) {
					System.out.println("Please enter email again because it already exists: ");
				} else {
					break;
				}
			}
			String passwrod = ScannerUtils.inputPassword();
			String firstname = ScannerUtils.inputName("Input firstname: ");
			String lastname = ScannerUtils.inputName("Input lastname: ");
			String phone = ScannerUtils.inputPhoneNumber();
			System.out.println("Input experience in year: ");

			byte expInYear = -1;
			while (true) {
				expInYear = (byte) ScannerUtils.inputIntPositive();
				if (expInYear < 1 || expInYear > 10) {
					System.out.println("Please enter experience in year again in paragraphs 1 to 10: ");
				} else {
					break;
				}
			}

			ProSkill proSkill = null;
			byte choice = -1;
			do {
				System.out.println("Input pro skill: ");
				System.out.println("1. DEV");
				System.out.println("2. TEST");
				System.out.println("3. JAVA");
				System.out.println("4. SQL");
				choice = (byte) ScannerUtils.inputInt();
			} while (choice < 1 || choice > 4);

			switch (choice) {
			case 1:
				proSkill = ProSkill.DEV;
				break;
			case 2:
				proSkill = ProSkill.TEST;
				break;
			case 3:
				proSkill = ProSkill.JAVA;
				break;
			case 4:
				proSkill = ProSkill.SQL;
				break;
			}

			ExperienceCandidate exCan = new ExperienceCandidate(firstname, lastname, phone, email, passwrod,
					Category.EXPERIENCECANDIDATE, expInYear, proSkill);

			if (con.registerExpCan(exCan)) {
				System.out.println("Register successful!");
			} else {
				System.out.println("Register fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void inputFreCan() {
		try {
			CandidateController con = new CandidateController();
			String email = null;
			while (true) {
				email = ScannerUtils.inputEmail();
				if (con.isEmailExists(email)) {
					System.out.println("Please enter email again because it already exists: ");
				} else {
					break;
				}
			}
			String passwrod = ScannerUtils.inputPassword();
			String firstname = ScannerUtils.inputName("Input firstname: ");
			String lastname = ScannerUtils.inputName("Input lastname: ");
			String phone = ScannerUtils.inputPhoneNumber();

			GraduationRank graduationRank = null;
			byte choice = -1;
			do {
				System.out.println("Input graduation Rank: ");
				System.out.println("1. Excellence");
				System.out.println("2. Good");
				System.out.println("3. Fair");
				System.out.println("4. Poor");
				choice = (byte) ScannerUtils.inputInt();
			} while (choice < 1 || choice > 4);

			switch (choice) {
			case 1:
				graduationRank = GraduationRank.EXCELLENCE;
				break;
			case 2:
				graduationRank = GraduationRank.GOOD;
				break;
			case 3:
				graduationRank = GraduationRank.FAIR;
				break;
			case 4:
				graduationRank = GraduationRank.POOR;
				break;
			}

			FresherCandidate freCan = new FresherCandidate(firstname, lastname, phone, email, passwrod,
					Category.FRESHERCANDIDATE, graduationRank);

			if (con.registerFreCan(freCan)) {
				System.out.println("Register successful!");
			} else {
				System.out.println("Register fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void register() {
		System.out.println("Input candidate category: ");
		System.out.println("1. ExperienceCandidate");
		System.out.println("2. FresherCandidate");
		byte choice1 = (byte) ScannerUtils.inputInt();
		Category cat = choice1 == 1 ? Category.EXPERIENCECANDIDATE : Category.FRESHERCANDIDATE;

		if (cat == Category.EXPERIENCECANDIDATE) {
			inputExpCan();
		} else {
			inputFreCan();
		}
	}

	public static void login() {
		try {
			CandidateController con = new CandidateController();
			String email = ScannerUtils.inputName("Input email: ");
			String passwrod = ScannerUtils.inputName("Input password: ");
			if (con.login(email, passwrod)) {
				System.out.println("Login successful!");
			} else {
				System.out.println("Login fail!");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			CandidateController con = new CandidateController();
			con.logout();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
