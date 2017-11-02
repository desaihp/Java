/*
 * copy Constructor
 * 
 */
package com.parameterizedConstructor.task;

//we can give a same student example  
public class CopyConstructor {

	int id;
	String name;

	public CopyConstructor(CopyConstructor c) {

		id = c.id;
		name = c.name;
	}

	public CopyConstructor(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}

	public static void main(String[] args) {

		CopyConstructor c1 = new CopyConstructor(110, "ABC");
		CopyConstructor c2 = new CopyConstructor(c1);

		c1.display();
		c2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id + " " + name);
	}

}
