/*\
 *@Aurthor:- Harshil Desai 
 *using loop method
 */

package com.JavaPrograms.task;

import java.util.Scanner;

public class FactorialNumbers {

	static int fact,i,Z;
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no:");
		Z = sc.nextInt();
		int temp =1;
		for(i=1;i<=Z;i++){
			temp= temp*i;
			
		}
		System.out.println("factorial is:"+temp);
	}

}
