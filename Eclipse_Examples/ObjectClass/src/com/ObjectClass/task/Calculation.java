/*
 * calling method with anonomous object
 * @Aurthor :-Harshil
 */


package com.ObjectClass.task;

public class Calculation {

	public static void main(String[] args) {

		new Calculation().fact(5);  //using calling method with anonomeous object
	}

	private void fact(int n) {

		int fact = 1;

		for (int i = 1; i < n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is :" + fact);
	}

}
