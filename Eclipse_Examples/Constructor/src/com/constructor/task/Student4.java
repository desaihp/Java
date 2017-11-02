/*
 * parateterized constructor example -
 */

package com.constructor.task;

public class Student4 {

	int id;
	 String name;

	// parameterized constructor is created
	public Student4(int i, String n) {
		id = i;
		name = n;
	}

	public static void main(String args[]) {

		Student4 s1 = new Student4(110, "ABC");
		Student4 s2 = new Student4(111, "XYZ");
		s1.display();
		s2.display();
	}

	public void display() {

		System.out.println(id + " " + name);

	}

}
