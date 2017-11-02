/*
 * @Aurthor :-Harshil Desai
 */

package com.JavaPrograms.task;

import java.util.Scanner;

public class PalindromeNumbers {

	static int Z, r; // r = reminder
	static int temp, sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		Z = sc.nextInt();
		temp = Z;
		while (Z > 0) {
			r = Z % 10; // getting reminder Z
			sum = (sum * 10) + r;
			Z = Z / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("not a Palindorme Number");
		}
	}

}
