package com.Inheritance.task;

class Animal2 {

	void eat() {
		System.out.println("Eating..");
	}
}

class Dog2 extends Animal2 {

	void bark() {
		System.out.println("Barking..");
	}
}

class Cat extends Animal2 {

	void meaw() {
		System.out.println("Meaw..Meaw..");
	}
}
// main code
public class HeirarchicalInheritance {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.eat(); // eat taken form parent class Animal 
		c.meaw(); // meaw taken from child class Cat

	}

}
