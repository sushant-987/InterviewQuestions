package com.java.programs;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number:");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		c = a + b;
		sc.close();

		System.out.println("Addition of Two Numbers:" + c);

	}

}
