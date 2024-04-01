package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public int examID;
	public String code;
	public String title;
	public CategoryQuestion[] category;
	public short duration;
	public Account creator;
	public LocalDate createDate;
}
