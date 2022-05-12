package com.chainsys.unittester;
import com.chainsys.variables.Bank;

public class Banktester {


	public static void testDeposit() {
		System.out.println("Before Balance " + Bank.currentBalance);
		Bank.deposit(20000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(1500);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("vimal", 625078198);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}

