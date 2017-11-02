package com.Inheritance.task;

class Animal1 {

	void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating..");

	}

}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking..");
	}
}

class BabyDog extends Dog1 {

	void weep() {
		System.out.println("weeping..");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();

		d.bark();
		d.weep();
	}

}
