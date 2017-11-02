package com.methodoverloading.task;

class Animal {
	String color = "White";

}

class Dog extends Animal {
	String color = "Black";

	public void printColor() {

		System.out.println(color);// print color from Dog class
		System.out.println(super.color); // print color from animal class -parent class
	}
}

public class Super {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.printColor();
	}

}
