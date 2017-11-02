/*
 * copying constructor without creating the class
 * we can use default constructor 
 */

//Copying constructor without creating the class

package com.parameterizedConstructor.task;

public class Students6 {

	int id;
	String name;

	// default constructor
	Students6() {
	}

	public Students6(int i, String n) {

		id = i;
		name = n;
	}

	public static void main(String[] args) {

		Students6 s1 = new Students6(110, "ABC");
		Students6 s2 = new Students6(111, "XYZ");

		s1.id = s2.id;
		s1.name = s2.name;
		s1.display();
		s2.display();

	}

	public void display() {

		System.out.println(id + " " + name);

	}

}
