/*
* @Aurthor:-Harshil Desai
 */

package com.JavaPrograms.task;

import java.util.Scanner;

public class PrimeNumbers {

	static int i, a = 0, flag = 0;
	static int numbers;
	static int prime;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		numbers = sc.nextInt();
		prime = numbers / 2; // to check the condition.
		for (i = 2; i <= prime; i++) {

			if (numbers % i == 0) {
				System.out.println(" not a prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("prime number");
		}
	}

}
