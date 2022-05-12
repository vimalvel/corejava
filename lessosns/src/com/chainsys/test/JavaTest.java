package com.chainsys.test;

import java.util.Scanner;

public class JavaTest {
	public static void main(String[] args) {
		// fizzbuzz();
		// EvenDigits();
		// Trianglemethod();
		// StringcountthewordandReversMethod();
		// Armstrongnumber();
		// Temperature();
		// Equation();
		//Alphabetsandthelength();
	}

	public static void fizzbuzz() {

		for (int n = 1; n <= 100; n++) {
			if (n % 3 == 0) {
				System.out.println("Fizz" + n);
			}
			if (n % 5 == 0) {
				System.out.println("Buzz" + n);
			}
			if (n % 3 == 0 && n % 5 == 0) {

				System.out.println("Fizz Buzz" + n);
			} else {
				System.out.println(n);
			}

		}

	}

	// 1546903
	public static void EvenDigits() {
		int i[] = { 1, 5, 4, 6, 9, 0 };
		for (int n = 0; n < i.length; n++) {
			if (i[n] % 2 == 0) {
				System.out.println("Even Number:" + i[n]);
			}
		}

	}

	public static void Trianglemethod() {

		int n = 10;
		for (int i = 1; i <= 10 - 1; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(".");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	public static void StringcountthewordandReversMethod() {
		String s2 = "Tom and jerry are good friends";
		System.out.println(s2);
		String trimString = s2.trim();
		String data[] = trimString.split(" ");
		int n = data.length;
		System.out.println("Number of words in string = " + n);
		char a[] = s2.toCharArray();
		System.out.println("Reversed String is:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);

		}
	}

	public static void Armstrongnumber() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three digits number:");
		int num = obj.nextInt();
		obj.close();
		int a = num;
		int n1, n2, n3;
		n3 = a % 10;
		a = a / 10;
		n2 = a % 10;
		a = a / 10;
		n1 = a % 10;
		int result = (n1 * n2 * n3) + (n1 * n2 * n3) + (n1 * n2 * n3);
		if (num == result) {
			System.out.println(num + ":it is armstrong number");

		} else {
			System.out.println(num + ":it is not a armstrong number");
		}
	}

	public static void Temperature() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int a = obj.nextInt();

		if (a == 1) {
			System.out.println("its raining so, to get the umberlla");
		}

		else if (a < 32) {
			System.out.println("The temperature is less than 32 degree so, to bring the heavy jacket ");
		} else if (a >= 32 && a <= 50) {
			System.out.println("The temperature is between 32 to 52 so, bring the light jacket");
		} else {
			System.out.println("there is a clear sky dont need any rain jackets");
		}

	}

	public static void Equation() {
		int x = 0;
		for (x = 5; x <= 10; x++) {
			int n = 2 * x * x + x + 5;
			System.out.println(n);
		}

	}

	public static void Alphabetsandthelength() {
		

			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your Name");
				String name = sc.nextLine();
				sc.close();
				char[] nameAsCharacters = name.toCharArray();
				int lengthofCharArray = nameAsCharacters.length;
				int ref = 0;

				if (lengthofCharArray < 8) {
					System.out.println("Name Must have atleast 8 chars");
				} else {
					String Uppercasename = name.toUpperCase();

					Uppercasename = Uppercasename.trim();
					char[] uppercaseCharArray = Uppercasename.toCharArray();
					lengthofCharArray = uppercaseCharArray.length;
					int asciiValue = 0;
					for (int index = 0; index < lengthofCharArray; index++) {
						asciiValue = (int) uppercaseCharArray[index];

						if (asciiValue < 65 || asciiValue > 90) {
							if (asciiValue != 32) {
								System.out.println("IN Valid Character in Name: ");
								ref++;
								break;
							}
						}

					}
					if (ref == 0) {
						System.out.println("this name is full of alphabet:" + name);
					}
				}

			}

		

	}
