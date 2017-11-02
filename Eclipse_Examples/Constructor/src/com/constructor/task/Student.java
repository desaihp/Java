/*
 * example of default constructor
here we are not creating any constructors so it will take default constructors
 */

package com.constructor.task;

public class Student {

	static int roll_no, r;
	static String name, n;

	public static void main(String[] args) {

		Student st = new Student();
		st.roll_no = r;
		st.name = n;
		st.display();
	}

	public void display() {

		System.out.println(roll_no + " " + name);
	}

}
