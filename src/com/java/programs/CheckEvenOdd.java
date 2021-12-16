package com.java.programs;

import java.util.Scanner;

public class CheckEvenOdd {
   public static boolean isOddEven(int n) {
      // if number is divisible by
      // 2 then number is even
      if(n % 2 == 0)
          return true;

      // else the number is odd
      return false;
   }

   public static void main(String[] args) {

      // declare variable
      int number = 0;
      boolean result = false;

      // create Scanner class object to take input
      Scanner scan = new Scanner(System.in);

      // read number from end-user
      System.out.print("Enter an integer number: ");
      number = scan.nextInt();

      // check number is even or not
      result = isOddEven(number);

      // display result
      if(result) 
         System.out.println(number+" is an even number");
      else 
         System.out.println(number+" is an odd number");

      // close Scanner class object
      scan.close();
   }
}