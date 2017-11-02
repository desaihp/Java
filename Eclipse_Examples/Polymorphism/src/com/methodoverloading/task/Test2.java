package com.methodoverloading.task;

class Bank {
	int gerRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int gerRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int gerRateOfInterest() {
		return 7;
	}
}

class Axis1 extends Bank {
	int gerRateOfInterest() {
		return 9;
	}
}

public class Test2 {

	public static void main(String[] args) {

		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis1 a = new Axis1();

		System.out.println("Rate of SBI interest is:" + s.gerRateOfInterest());
		System.out.println("Rate of ICICI interest is:" + i.gerRateOfInterest());
		System.out.println("Rate of Axis interest is:" + a.gerRateOfInterest());

	}

}
