package com.aggregation.task;

class Operation {
	// we used int so we have to do return the function
	int Square(int n) {
		return n * n;

	}
}

class Circle {

	Operation op; // Assigned Aggregation

	double PI = 3.14;

	double area(int radius) {
		op = new Operation();

		int rSquare = op.Square(radius);// code reusability(delegates the method
										// call)

		return PI * rSquare;
	}
}

public class SimpleAggregation {

	public static void main(String[] args) {

		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}

}
