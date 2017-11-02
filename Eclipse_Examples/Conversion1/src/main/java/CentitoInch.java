

import java.util.Scanner;

public class CentitoInch {

	

	public static void main(String[] args) {
		
		// declare variable
		double centimeters;
		double inches;
		double rate;
		// assign value- centimeter to inches 1 cm = 0.393701 inches
		rate = 0.393701;
		// ask user to enter the value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of centimeters:");
		centimeters = sc.nextInt();
		// print
		inches = rate * centimeters;
		System.out.println("no of inches" + inches);

	}

}
