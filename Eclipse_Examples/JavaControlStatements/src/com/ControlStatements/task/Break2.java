/*
 * 
 * Break Example with inner loop 
 * Author :-Harshil Desai
 */

package com.ControlStatements.task;

public class Break2 {

	public static void main(String[] args) {

		int i;
		int j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
