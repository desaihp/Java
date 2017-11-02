package com.fibonacci.task;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, c = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = input.nextInt();
		System.out.println("error");

		while (c <= n) {
			c = a + b;
			if (c >= n) {
				break;
			}
			System.out.println(c + " ");
			a = b;
			b = c;

		}

	}
}