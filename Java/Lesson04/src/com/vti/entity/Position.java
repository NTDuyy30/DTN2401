package com.vti.entity;

public class Position {
	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM;
	}

	private int positionID;
	private PositionName positionName;

	public Position() {

	}

	public Position(int positionID, PositionName positionName) {
		super();
		this.positionID = positionID;
		this.positionName = positionName;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionName=" + positionName + "]";
	}

}
