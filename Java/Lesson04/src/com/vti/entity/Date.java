package com.vti.entity;

public class Date {
//	Properties
	private int day;
	private int month;
	private int year;

//	Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

//	Method get, set
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

//	Method toString
	@Override
	public String toString() {
		System.out.printf("%d - %d - %d", this.day, this.month, this.year);
		return null;
	}

//	Method other
	public boolean isLeapYear() {
		if (this.year % 4 == 0) // chia hết cho 4 là năm nhuận
		{
			if (this.year % 100 == 0)
			// nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì k phải là năm nhuận
			{
				if (this.year % 400 == 0)// chia hết cho 400 là năm nhuận
					return true;
				else
					return false;// không chia hết cho 400 thì không phải năm nhuận
			} else// chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
				return true;
		} else {
			return false;
		}
	}
}
