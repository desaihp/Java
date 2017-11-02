//ask raxit


package com.ObjectClass.task;

public class Account {

	static float amount;
	static float amt;
	static float acc;
	static String cust_name, acc_no, name;

	public static void main(String[] args) {

		Account a = new Account();
		a.insert(8023817, "harshil", 90000);
		a.display();
		a.CheckBalance();
		a.deposit(4000);
		a.CheckBalance();
		a.withdraw(1100);
		a.display();

	}

	private void withdraw(float amt) {

		if (amount < amt) {
			System.out.println("InSufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + ":withdraw");
		}

	}

	public void deposit(float amt) {

		amount = amount + amt;
		System.out.println(amt + ":deposit");

	}

	public void CheckBalance() {

		System.out.println("Balance is :" + amount);

	}

	public void display() {
		System.out.println(acc_no + "" + cust_name + "" + amount);
	}

	public void insert(int acc, String name, float amt) {

		int acc_no = acc;
		String cust_name = name;
		float amount = amt;

	}

}
