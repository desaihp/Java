
/*
 * basic example of emplyoment form using aggregation
 */
package com.aggregation1.task;

public class Emp {
	int id;
	String name;
	Address address; // Aggregation

	public Emp(int id, String name, Address address) {
		// TODO Auto-generated constructor stub

		this.id = id;
		this.name = name;
		this.address = address;

	}

	public void display() {

		System.out.println(id + "" + name);
		System.out.println(address.city + "" + address.state + "" + address.country);
	}

	public static void main(String[] args) {

		Address address1 = new Address("Matar", " Gj ", " India ");
		Address address2 = new Address("Ahmedabad", " Gj ", " India ");

		Emp e1 = new Emp(110, " ABC ", address1);
		Emp e2 = new Emp(111, " XYZ ", address2);

		e1.display();
		e2.display();

	}

}
