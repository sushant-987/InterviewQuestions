package com.java.programs;

//factorial program using recursion in java
public class Factorial2 {

	static int factorial(int n) {
		if (n == 0)
			return 1;

		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It is the number to calculate factorial
		int  fact = 1;
		int number = 4;

		// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);

	}
}
