package com.ControlStatements.task;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int A = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		A = sc.nextInt();
		do {
			System.out.println(A);
			A++;
		} while (A <= 10);

	}

}
