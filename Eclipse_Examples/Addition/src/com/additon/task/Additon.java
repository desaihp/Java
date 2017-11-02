package com.additon.task;

import java.util.Scanner;

public class Additon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1) for additon:");
		x= sc.nextInt();
		System.out.println("Enter the value 2) for addition");
		y= sc.nextInt();
		z= x + y;
		System.out.println("additon of two numbers :"+z);
		}

}
