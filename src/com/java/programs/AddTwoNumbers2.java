package com.java.programs;

import java.util.Scanner;

public class AddTwoNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num1,num2,sum;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter First Number:");
    num1=sc.nextInt();
    
    System.out.println("Enter Second Number:");
    num2=sc.nextInt();
    
    sc.close();
    sum=num1 +num2;
    
    System.out.println("Sum of these Numbers:"+ sum);
    
    	
	}

}
