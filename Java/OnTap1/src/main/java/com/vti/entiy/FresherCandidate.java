package com.vti.entiy;

public class FresherCandidate extends Candidate {
	public enum GraduationRank {
		EXCELLENCE, GOOD, FAIR, POOR;
	}

	private GraduationRank graduationRank;

	public FresherCandidate() {
		super();
	}

	public FresherCandidate(String firstName, String lastName, String phone, String email, String password,
			Category category, GraduationRank graduationRank) {
		super(firstName, lastName, phone, email, password, category);
		this.graduationRank = graduationRank;
	}

	public GraduationRank getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(GraduationRank graduationRank) {
		this.graduationRank = graduationRank;
	}

	@Override
	public String toString() {
		return "FresherCandidate [graduationRank=" + graduationRank + ", toString()=" + super.toString() + "]";
	}

}
