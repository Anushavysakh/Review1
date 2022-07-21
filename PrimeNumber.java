package com.review1.bridglabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if (n % 2 != 0) {
			System.out.println("The given number" + n + " is a prime number");
		} else {
			System.out.println("The given number" + n + " is not a prime number");
		}
	}

}
