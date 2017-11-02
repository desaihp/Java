package com.ControlStatements.task;

public class label {

	public static void main(String[] args) {
		int i, j;
		aa: for (i = 1; i <= 5; i++) {

			bb:

			for (j = 1; j <= 5; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}

				System.out.println(i + "" + j);

			}
		}
	}
}
