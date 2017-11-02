package com.ObjectClass.task;

public class Rectangle {

	float Area;
	float length;
	float width;

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.insertValue(10, 10);
		r1.calculateArea();
		r1.diaplay();

	}

	private void insertValue(int l, int w) {

		length = l;
		width = w;

	}

	private void calculateArea() {

		float Area = length * width;

		System.out.println(Area);
	}

	private void diaplay() {

		System.out.println(Area);
	}

}
