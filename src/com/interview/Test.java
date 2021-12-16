package com.interview;

class A { 
	  public void display() { 
	    System.out.println("I am A"); 
	  } 
	} 
	class B extends A { //B is a subclass of A 
	  //Override 
	  @Override 
	  public void display() { 
	    System.out.println("I am B"); 
	  } 
	  public int add(int x, int y) { 
	    return x+y; 
	  } 
	  //Overload 
	  public double add(double x,double y) { 
	    return x+y; 
	  } 
	} 
	class Test { 
	  public static void main(String[] args) { 
	    A a=new A(); 
	    a.display(); //Displays "I am A" 
	    B b=new B(); 
	    b.display(); //Displays "I am B" 
	    System.out.println(b.add(5,2)); //displays 7 
	    System.out.println(b.add(5.,2.)); //adhoc polymorphism, displays "7.0" 
	    a=b; //a acts as a reference to the object b 
	    a.display(); //dynamic polymorphism or dynamic method dispatch, displays "I am B" 
	   } 
	} 