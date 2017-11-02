package com.JavaPrograms.task;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {

		int Z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		Z = sc.nextInt();
		int factorial = fact(Z);
		System.out.println(factorial);
	}

	private static int fact(int Z) {

		int output, n = 0;
		
		if (n == 1) {
			return 1;
		}
		// recursion function calling itself
		output = fact(n - 1) * n;
		return output;
	}

}
