package com.vti.entiy;

public class Project {
	private int id;
	private String projectName;
	private short teamSize;

	public Project() {

	}

	public Project(int id, String projectName, short teamSize) {
		this.id = id;
		this.projectName = projectName;
		this.teamSize = teamSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public short getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(short teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", teamSize=" + teamSize + "]";
	}

}
