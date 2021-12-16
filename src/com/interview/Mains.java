package com.interview;

interface Stop

{

public abstract void sub(int a,int b);

}

class Shift

{

void nonStaticMethod() {

System.out.println("Non static method must be called by creating an object");

}

}

interface I

{

public void sleep();

public void mul(int a,int b);

public int odd(int a);

}

abstract class B1 extends Shift implements I,Stop

{

public void sleep()

{

System.out.println("im sleeping");

}

}

abstract class C extends B1

{

static int x=2;

public void mul(int a,int b)

{

System.out.println(a*b);

}

}

abstract class D extends C

{

public int odd(int a)

{

if(a%super.x==1)

return 0;

else

return 1;

}

}

final class E extends D

{

public void sub(int a,int b)

{

System.out.println(a-b);

}

public void mul(int a,int b)

{

System.out.println(a*b);

}

}

class Mains {

final int x = 10;

public static void main(String[] args) {

Mains myobj = new Mains(5,6,7);

E ob=new E();

ob.sleep();

ob.mul(6,7);

ob.sub(9,5);

ob.nonStaticMethod();

myobj.numb();

}

void numb()

{

int x=5;

E ob=new E();

int c= ob.odd(this.x);

}

Mains(int a,int b,int c)

{

System.out.println(a+b+c);

}

Mains(int a,int b)

{

System.out.println(a+b);

}

}