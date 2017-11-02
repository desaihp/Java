package com.ControlStatements.task;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		/*
		 * 1st method int a = 10; int b = 30;
		 * 
		 * if (a > b) { System.out.println("a is greter than b"); } else {
		 * System.out.println("b is greter than a"); }
		 */
		/*
		 * 
		 * 2nd method
		 */

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a:");
		a = sc.nextInt();
		System.out.println("enter the value of b:");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}

	}

}
