package com.vti.fontend;

import com.vti.backend.presentation.UserController;

public class Program {
	public static void main(String[] args) {
		UserController us = new UserController();
		if (us.registerUser("new2", "1111")) {
			System.out.println("Register user successful!");
		} else {
			System.out.println("Register user fail!");
		}
		if (us.registerUser("new3", "1111")) {
			System.out.println("Register user successful!");
		} else {
			System.out.println("Register user fail!");
		}
	}
}
