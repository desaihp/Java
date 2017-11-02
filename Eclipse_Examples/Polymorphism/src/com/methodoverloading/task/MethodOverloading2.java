/*
 * Methodoverloading :- changing the DataType Of arguments
 */

package com.methodoverloading.task;

class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

}

public class MethodOverloading2 {

	public static void main(String[] args) {

		System.out.println(Adder1.add(10, 20));
		System.out.println(Adder1.add(10.2, 20.4, 30.5));
	}

}
