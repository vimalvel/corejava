package com.chainsys.variables;
import java.util.Scanner;
public class Bank {
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;

	public static void deposit(int parmAmount) {
		currentBalance = currentBalance + parmAmount;

	}

	public static int withdraw(int parmAmount) {
		currentBalance = currentBalance - parmAmount;
		return parmAmount;

	}

	public static void openAccount(String parmName, int parmAccountNumber) {

		customerName = parmName;
		accountNumber = parmAccountNumber;

	}
}



