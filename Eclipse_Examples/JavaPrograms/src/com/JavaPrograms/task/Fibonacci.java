/*
 * Aurthor :- Harshil Desai
 */

package com.JavaPrograms.task;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0, b = 1, c;
		int count = 10, i;
		System.out.println(a); // printing 0 and 1
		System.out.println(b); // printing 0 and 1
		for (i = 2; i < count; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
