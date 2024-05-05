package com.vti.entiy;

public class ExperienceCandidate extends Candidate {
	public enum ProSkill {
		DEV, TEST, JAVA, SQL;
	}

	private byte expInYear;
	private ProSkill proSkill;

	public ExperienceCandidate() {
		super();
	}

	public ExperienceCandidate(String firstName, String lastName, String phone, String email, String password,
			Category category, byte expInYear, ProSkill proSkill) {
		super(firstName, lastName, phone, email, password, category);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public byte getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(byte expInYear) {
		this.expInYear = expInYear;
	}

	public ProSkill getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkill proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "ExperienceCandidate [expInYear=" + expInYear + ", proSkill=" + proSkill + ", toString()="
				+ super.toString() + "]";
	}

}
