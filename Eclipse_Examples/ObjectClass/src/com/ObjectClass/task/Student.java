/*
 * 
 * By Method
 * @Aurthor:-Harshil Desai
 */


package com.ObjectClass.task;

class Student {

	int rollno;
	String name;

	public static void main(String args[]) {

		Student s1 = new Student();
		s1.insertRecord(111, "harshil");

		Student s2 = new Student();
		s2.insertRecord(112, "Raxit");

		s1.displayRecord();
		s2.displayRecord();

	}

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	private void displayRecord() {

		System.out.println(rollno + " " + name);

	}
}