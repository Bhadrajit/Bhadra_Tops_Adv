package com.Assigment;

import java.awt.print.Book;

public abstract class abstractclassdemo {
	abstract int getBalance();
}

class BankA extends Book {

private int balance;

void deposit(int money) {

balance += money;
}
    int getBalance() {
    return balance;
    }
	}
	class BankB extends Book {

		private static abstractclassdemo a;
		private static abstractclassdemo b;
		private int balance;

		void deposit(int money) {

		balance += money;
		}

		int getBalance() {
      return balance;
      }
		int getBalance1() {

		return balance;

		}
public static void main(String[] args) {
	BankA bankA = new BankA();
	BankB bankB = new BankB();

	bankA. deposit(100);
	bankB. deposit(150);

	System.out.println("Balance of Bank A = $"+a.getBalance());
	System.out.println("Balance of Bank B = $"+b.getBalance());
}
}