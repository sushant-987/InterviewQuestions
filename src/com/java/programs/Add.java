package com.java.programs;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num1,num2,result;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter First number:");
   num1=sc.nextInt();
   System.out.println("Enter Second number:");
   num2=sc.nextInt();
   
   sc.close();
   result = num1 + num2;
   
   
   System.out.println("Addition of these numbers:"+ result);
	}

}
