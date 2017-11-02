/*
 * in Hybrid Inheritance : implementation works on single & Hierarchical Inheritance
 */


package com.Inheritance.task;

class C {

	void disp() {
		System.out.println("C");
	}
}

class A extends C {
	void disp() {
		System.out.println("A");
	}
}

class B extends C {
	void disp() {
		System.out.println("B");
	}
}

class D extends C {
	void disp() {
		System.out.println("D");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D obj = new D();
		obj.disp();
	}

}
