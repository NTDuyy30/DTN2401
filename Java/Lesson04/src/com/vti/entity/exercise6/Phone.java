package com.vti.entity.exercise6;

public abstract class Phone {
	public abstract void showContacts();

	public abstract void insertContact(String name, String number);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newNumber);

	public abstract void searchContact(String name);

}
