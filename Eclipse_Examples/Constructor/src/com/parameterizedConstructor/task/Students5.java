/*
 * Constructor Overloading
 */



package com.parameterizedConstructor.task;

public class Students5 {

	int id;
	int age;
	String name;
	
//we are creating more than one constructor
	public Students5(int i, String n) {
		id = i;
		name = n;

	}

	public Students5(int i, String n, int a) {

		id = i;
		name = n;
		age = a;
	}

	public static void main(String[] args) {

		Students5 s1 = new Students5(110, "ABC", 20);
		Students5 s2 = new Students5(112, "XYZ", 22);

		s1.display();
		s2.display();

	}

	public void display() {

		System.out.println(id + " " + name+" " +age);
	}

}
