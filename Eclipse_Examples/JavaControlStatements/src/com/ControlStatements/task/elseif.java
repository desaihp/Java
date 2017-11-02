package com.ControlStatements.task;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		int MARKS = 65;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		MARKS = sc.nextInt();
		if (MARKS < 50) {
			System.out.println("FAIL");
		} else if (MARKS >= 50 && MARKS <= 60) {
			System.out.println("D Grade");
		} else if (MARKS >= 60 && MARKS <= 70) {
			System.out.println("C Grade");
		} else if (MARKS >= 70 && MARKS <= 80) {
			System.out.println("B Grade");
		} else if (MARKS >= 80 && MARKS <= 90) {
			System.out.println("A Grade");
		} else if (MARKS >= 90 && MARKS <= 100) {
			System.out.println("A+ Grade");
		} else {
			System.out.println("INVALID RESULT");
		}

	}

}
