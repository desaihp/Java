/*
 * Single Inheritance
 */

package com.Inheritance.task;

class Animal {

	void eat() {
		System.out.println("Eating..");
	}

}

class Dog extends Animal{     // we create inheritance
	void bark(){
		System.out.println("Barking..");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Dog d = new Dog();

		d.bark();
		d.eat();

	}

}
