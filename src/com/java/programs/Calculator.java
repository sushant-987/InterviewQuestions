package com.java.programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1,num2, Addition,Substraction,Multiplication,Divison ;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter First Number:");
      num1=sc.nextInt();
      System.out.println("Enter Second Number:");
      num2=sc.nextInt();
      
      System.out.println("Enter an operator(+,-,*,/):");
      char operator =sc.next().charAt(0);
      sc.close();
      
      
   switch(operator)
   {
   case  '+':
	   Addition = num1 + num2;
	System.out.println("Addition of two numbers:" +Addition); 
	break;
	
   case '-':
	   Substraction = num1 - num2;
	 System.out.println("Substraction of two numbers:" +Substraction);  
      
   case '*':
	   Multiplication = num1 * num2;
		System.out.println("Multiplication of two numbers:" +Multiplication); 
		break;
	
   case '/':
	   Divison = num1 / num2;
		System.out.println("Divison numbers:" +Divison); 
		break;
		
	default :
		
		System.out.println("You have Entered wrong operator:");
	
				
	}

	}
}
