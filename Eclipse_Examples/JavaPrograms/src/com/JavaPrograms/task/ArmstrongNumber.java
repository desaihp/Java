/*
 * ARmstrongNumbers using Recursion method
 * @Aurthor :-Harshil Desai
 */

package com.JavaPrograms.task;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int Z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		Z = sc.nextInt();

		// result printing

		if (ArmNumber(Z)) {   //creating a method
			System.out.println("Armstrong no:");
		} else {
			System.out.println("Not a Armstrong no:");
		}

	}

	private static boolean ArmNumber(int Z) {

		int result = 0, number = 0;
		int Original_Number = Z;

		while (Z != 0) {
			int reminder = Z % 10;
			result = result + reminder * reminder * reminder;
			Z = Z / 10;
		}
		if (Original_Number == result) {
			return true;
		} else {
			return false;
		}

	}

}
