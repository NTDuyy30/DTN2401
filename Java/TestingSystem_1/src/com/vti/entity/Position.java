package com.vti.entity;

public class Position {
	public int positionID;
	public PositionName positionName;

	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM;
	}
}
