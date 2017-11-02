/*
 * super using constructor
 */

package com.methodoverloading.task;

class person {

	int id;
	String name;

	person(int id, String name) { // create constructor
		this.id = id;
		this.name = name;

	}
}

class Emp extends person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name); // reusing constructor
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}

public class Super4 {

	public static void main(String[] args) {
		Emp e = new Emp(111, "ABC", 50000);
		e.display();
	}

}
