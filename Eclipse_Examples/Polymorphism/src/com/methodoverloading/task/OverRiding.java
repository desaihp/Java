package com.methodoverloading.task;

class Vehicle {
	void run() {
		System.out.println("Vehicle is Running:");
	}	
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is Running:");
	}
}

public class OverRiding {

	public static void main(String[] args) {

		Bike obj = new Bike();
		obj.run();

	}

}
