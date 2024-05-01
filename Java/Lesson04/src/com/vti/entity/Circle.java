package com.vti.entity;

public class Circle {
//	Properties
	private double radius;
	private String color;
	public static final Double PI = 3.14;

//	Constructor
	public Circle() {
		this.radius = 1.0d;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

//	Method get, set
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	Method toString
	@Override
	public String toString() {
		System.out.printf("%10f %10s", this.radius, this.color);
		return null;
	}

//	Method other
	public double area() {
		return PI * radius * radius;
	}
}
