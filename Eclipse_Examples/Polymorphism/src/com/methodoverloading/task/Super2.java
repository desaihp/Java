package com.methodoverloading.task;

class Animal2 {
	void eat() {
		System.out.println("eating");
	}
}

class Dog2 extends Animal2 {
	void eat() {
		System.out.println("eating");
	}

	void bark() {
		System.out.println("barking");
	}

	void work() {
		bark();
		super.eat();
	}
}

public class Super2 {

	public static void main(String[] args) {

		Dog2 d = new Dog2();
		d.work();

	}
}
