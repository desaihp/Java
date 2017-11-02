package com.methodoverloading.task;

class Animal4 {
	void Animal() {
		System.out.println("animals are created");
	}
}

class Dog4 extends Animal4 {
	Dog4() {
		super();

		System.out.println("Dogs are created");

	}
}

public class Super3 {

	public static void main(String[] args) {

		Dog4 d = new Dog4();

	}

}
