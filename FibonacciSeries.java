package com.review1.bridglabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3;
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for (int i =0; i < num; i++) {
			n3 = n1 + n2;
			System.out.println("Fibonacci series " + n3);
			n1 = n2;
			n2 = n3;

		}

	}
}