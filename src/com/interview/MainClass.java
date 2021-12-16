package com.interview;

public class MainClass {
	int add;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m1=new MainClass();
	    NotMains n1=new NotMains();
		m1.add(10,5);
		m1.add(2.0f,5.0f);
		m1.add(1, 2);
		n1.add(20, 5);
      
	}

	
	public int add(int x,int y)
	{
		add=x+y;
		System.out.println("Add method completed");
		return x+y;
	}
	//Overload
	public float add(float x,float y)
	{
		System.out.println("2nd add method completed");
		return x+y;
	}

	
	
		
		
	}
	

