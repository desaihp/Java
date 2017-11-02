package com.ObjectClass.task;

public class Employee {

	int id;
	String name;
	float salary;

	public static void main(String[] args) {

		Employee s1 = new Employee();
		s1.insertRecord(100, "cxs", 90000);

		Employee s2 = new Employee();
		s2.insertRecord(101, "XYZ", 10000);

		Employee s3 = new Employee();
		s3.insertRecord(103, "ABC", 45000);

		s1.displayRecord();
		s2.displayRecord();
		s3.displayRecord();
	}

	public void insertRecord(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;

	}

	public void displayRecord() {

		System.out.println(id + " " + name + salary);
	}
}
