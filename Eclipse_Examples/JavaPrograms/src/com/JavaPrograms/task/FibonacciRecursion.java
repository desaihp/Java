/*
 *Aurthor:- Harshil Desai
 */

package com.JavaPrograms.task;

public class FibonacciRecursion {

	static int a = 0, b = 1, c;
	static int count = 10;

	static void printFibonacci(int count) {

		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c +" ");
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(" "+a + " " + b +" ");// print 0 and 1
		// System.out.println(a);
		 //System.out.println(b);
		
		printFibonacci(count - 2);// 2is already printed

	}

}
