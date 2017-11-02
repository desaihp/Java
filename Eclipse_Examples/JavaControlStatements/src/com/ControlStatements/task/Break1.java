package com.ControlStatements.task;

import java.util.Scanner;

public class Break1 {
	public static void main(String[] args) {
		int A = 0, i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		i = sc.nextInt();

		for (i = 1; i <= 10; i++) {
			
			if (i == 5) {
				break;

			}
			System.out.println(i);
		}

	}

}
