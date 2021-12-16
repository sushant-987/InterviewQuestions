package com.mypack;

 public class A {

	void msg(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		A a=new A();
		a.msg();
		B b=new B();
		b.msg();
		C c1=new C();
				
		
	}
}
 
 class B extends A  {
	
	void msgs(){
		System.out.println("Hii");
	}

 class C extends B{
	 
	 void msgss(){
		 
	 }


}
}