package com.interview;

import java.util.Scanner;

public class AddTwoNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, addition, substraction, multiplication, divison;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		num1 = sc.nextInt();

		System.out.println("Enter the Second number");
		num2 = sc.nextInt();

		System.out.print("Select an operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);

		sc.close();

		switch (operator) {
		case '+':
			addition = num1 + num2;
			System.out.println("Addition of two numbers: " + addition);
			break;

		case '-':
			substraction = num1 - num2;
			System.out.println("Substraction of two numbers: " + substraction);
			break;

		case '*':
			multiplication = num1 * num2;
			System.out.println("Multiplication of two numbers: " + multiplication);
			break;

		case '/':
			divison = num1 / num2;
			System.out.println("Divison of Two numbers: " + divison);
			break;

		default:
			System.out.println("You have entered wrong Operator");
		}

	}
}
/*
 * 
 * import java.util.Scanner; public class AddTwoNumbers2 {
 * 
 * public static void main(String[] args) {
 * 
 * int num1, num2, sum; Scanner sc = new Scanner(System.in);
 * System.out.println("Enter First Number: "); num1 = sc.nextInt();
 * 
 * System.out.println("Enter Second Number: "); num2 = sc.nextInt();
 * 
 * sc.close(); sum = num1 + num2;
 * System.out.println("Sum of these numbers: "+sum); } }
 * 
 */