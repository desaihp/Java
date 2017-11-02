package CentitoInch;

import java.util.Scanner;

public class CentitoInches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variables
				double centimeters;
				double inches;
				double rate;
				// assign value- centimeter to inches 1 cm = 0.393701 inches
				rate = 0.393701;
				// ask user to enter the value
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of centimeters:");
				centimeters = sc.nextInt();
				// calculate inches
				inches = rate * centimeters;
				System.out.println("no of inches" + inches);

	}

}
