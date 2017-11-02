/*
 * 
 * Without using this keywords
 */


package com.ThisKeyword.task;


class Student {

	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;

	}

	public void display() {

		System.out.println(rollno + " " + name + "" + fee);
	}
}

public class WithoutThis {
	public static void main(String args[]) {
		Student s1 = new Student(110, "ABC", 1000f);
		Student s2 = new Student(111, "XYZ", 2000f);

		s1.display();
		s2.display();

	}

}
