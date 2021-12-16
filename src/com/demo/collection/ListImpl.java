package com.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class ListImpl {

	
	public static void main(String[] args) {
		
	
		
		
		listImpl();

			//vector fast[syc] -- or linkedlist[not sync]  vs arraylist [not sync]
	
	
		/***
		 * 
		 * 
		 * Collection vs Collections
		 * Collection vs Map
		 * AL vs Array
		 * AL vs Vector
		 * AL vs LInkedlist
		 * 
		 * 
		 */
		
		//singlethread env--> vector --. slow 
		//
	}


	/***
	 * default imports in java --> Are -> 
	 * 					java.lang package and 
	 * 					all classes from same package
	 * 
	 * 
	 * Iterable --> is an interaface which is coming from --> java.lang package
	 * 		iterable is the functionality which allows us to access elements one by one- -> from group of elements
	 * 		
	 * 		public Iterator iterator();		---> abstract method -->??
	 *
	 *		 Iterator --> java.util -->
	 *
	 *	iterator --> this method implementation will be inside all implemented classes--. 		
	 *						such as -- AL,LL,V,S,HSET,LHST,TSET
	 *
	 *
	 * 
	 * 
	 * Collection ---> 
	 * 				Collection is a group of element, which can of similar/diff -- hom/hetro types--> as
	 * a single Entity --> 
	 * 
	 * 				
	 * 
	 * Arraylist -->
	 *		
	 * 	Array vs AL
	 *  Right Left Operators
	 *  AL/Coll/Iter/Set/--> properties--> 
	 *  Coll and Coll Frm -. Hierarchy--. 
	 *  DS --> 
	 *  				
	 * 			fillratio --> 
	 * 			AL 				-->   Vector	100% --> fill ratio --. 4th construtor
	 * 			()--noarg		() -noarg
	 * 			()--int			() --int
	 * 			()--colln		() -coll
	 * 							() -int,int	--> fill ratio --> when to grow
	 * 
	 * 			10				10
	 * 	grow					doubles the size
	 * 		cp*3/2+1 [<=1.6]
	 * 		cp+cp>>1  [>=1.7]
	 * 
	 * 			1.2					1.0[legacy]
	 *			!sync				Sync				--> toggle button
	 *								threadsafe				ON-OFF				initial state
	 *					at a time one thread				Thread -->5 thread -->				off
	 *															every thread1 -->	on
	 *																  thread2		off
	 *																  thread3		on
	 *																  thread4		off
	 *																  thread5  		on
	 *																----------------------
	 *																		thread safe
	 		if we have data--> and performing multiple on that data
	 		we are able --tell final/consistant state--> thread safe..
	 		
	 */																	

	

	private static void listImpl() {
			
		
		
		arrayListImpl();
		linkedListImpl();
		vectorImpl();
		stackimpl();
	}

	private static void stackimpl() {
		// TODO Auto-generated method stub
		
	}

	private static void vectorImpl() {
		// TODO Auto-generated method stub
		
	}

	private static void linkedListImpl() {
		LinkedList<Integer> values1 = new LinkedList<Integer>(); // 
		values1.add(1289);		// as a doubly linked
		values1.add(289);
		values1.add(2589);
		values1.add(689);
		
		values1.get(0); //1 iterations
				values1.get(2); // will start from --> 2+1 --> 3 node chi value
		
		
		ArrayList<Integer> vals = new ArrayList<Integer>();//default capacity -> 10
		vals.add(10);
		vals.add(203);
		vals.add(2334);// inside array
		
				vals.get(2);// index 2 value return karel
		
		LinkedList<Integer> values2 = new LinkedList<Integer>(vals);
		
		
	}

	private static void arrayListImpl() {
		
		//() --> default capacity - 10
		//(int) --> we can specifiy the default capacity
		//(colln) --. colln.size() --> based
		
		
		ArrayList<Integer> al1  = new ArrayList<Integer>();  // default capacity -- 10 15 22
		System.out.println("ISEMPTY(1)-->" +al1.isEmpty());
		
		al1.add(10);	// we are adding the element
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(20);
		al1.add(33);
		al1.add(10);// --. grow karun 
		
		
		al1.add(11); // m --?
		
		// list --> 40,10
		System.out.println(al1.subList(3, 5));
		
		
		System.out.println(al1.indexOf(10)); //0
		System.out.println(al1.lastIndexOf(10));//7
		
		System.exit(0);
		
		List<Integer> val = new ArrayList<Integer>();
		val.add(10); val.add(20); val.add(10);
		val.add(10);
		val.add(102);
		val.add(101);
		val.add(103);
		val.add(103);
		
		//al1.removeAll(val); // val madhe present ahet te sodun baki sarv remove kar
		//al1.addAll(val);
		al1.clear(); // size- 0 -- isempty--true
		
		System.out.println(al1);
		System.exit(0);
		
		//removeall -- > params--> params-- matching-- remove kele jata
		//retainall -> param --> matching--> thevle-- baki sarv remove 
		
		
		
		
		
		
		
		//toArray --> returns elements in --> array format
						//object[]  -- specific []
		
		Object[] values = al1.toArray(); // generic-- object type cha
		System.out.println("1-->"+Arrays.toString(values));
		
		
		Integer []num1  = new Integer[al1.size()];
		num1 = al1.toArray(num1);
		System.out.println("2-->"+Arrays.toString(num1)); // specific type--> 
		System.exit(0);
		
		
		
		System.out.println(al1.contains(10)); // 120 present ahe --> true-- false
		System.out.println(al1.containsAll(val)); // all present--True-- False
		
		
		
		System.exit(0);
		System.out.println(al1);
		System.out.println("ISEMPTY(2)-->" +al1.isEmpty());
		System.out.println(al1.remove(new Integer(10))); 
		
		
		System.out.println(al1.removeAll(val)); // matching all elements will be removed
		System.out.println(al1);
		
		
		System.exit(0);
		
		
		
		ArrayList<Integer> al2  = new ArrayList<Integer>(20);// with given value -- 20 30 45	 
		
		System.out.println(al1.isEmpty());
		System.out.println(al2.isEmpty());
		
		
		// size --> 0 ---> isempty -- True 
		
		ArrayList<Integer> al3  = new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		
		System.out.println(al3.isEmpty()); // False
		
		ArrayList<Integer> al4  = new ArrayList<Integer>(al3);	// with al3.size()-->4 6 9 13
		System.out.println(al4);
		System.out.println(al4.isEmpty()); //True
		
		
		System.exit(0);
		
		
		
		
		/**
		 * What is generics --> 
		 * 			Generics is the mechasism to add a support for Dynamically programming
		 * 					--. to avoid class cast exception and 
		 * 					--> to provide provide compile time safety..
		 * 
		 * Arraylist   
		 * 			Array --> Arrays.copyof --> 
		 * 			No need to define the size in Advance --> 
		 * 					bydefault--> capacity of the AL --> 10	--> internal array -- 10 la
		 *  
		 * Array
		 * 			We need to define --> size --> in advance
		 * 			Fixed IN size --> 
		 * 			Can hold Hom Data Elements
		 * 			Cannot grow/Shrink up
		 * 			Array stores the element --> in continous memory
		 * 			Continous -> memory -- we can access the data thru Index -->
		 * 			Index Based operations -> Fast --> For searching and retrival
		 * 			Array Supported Operations -->
		 * 						read
		 * 						update/modify	
		 * 						add/insert/delete ---. in this-- size vary  -- not supported
		 * 		
		 * 
		 * 1.7 -- AL -- object creation -- capacity 10 								--> 10[eager loading]
		 * 1.8 --> AL - object creation -  capacity 0 --> first element add--10		--> 10[lazy loading]
		 * 
		 * 
		 * <=1.6 --> grow --> 	(cp * 3/2)+1  --> when grows --> 100% existing array full --. fill ratio 100%
		 * >1.6  --> grow -->   (cp+cp>>1)    --> when grows --> 100% existing array full --. fill ratio 100%
		 * 
		 * 
		 * cp --> 10
		 * 
		 * 1.6 --> 10*3/2+1	--> 30/2 + 1	--> 15+1 --> 16
		 * >=1.7 -> 10 + 10>>1	--> 10 + 5 ---> 15 --> 
		 * 
		 * 
		 * 
		 * 
		 * 10 --> 15 ---> 22 ---> 33 ---> 33+16 -----> sum(33+16)+sum(33+16)/2
		 * 
		 * 
		 * <<   --> left shift operator
		 * >>   --> right shift operator
		 * >>>  --> right shift with filled zero
		 * 
		 * 
		 */
		
		
		int num = 500;
		System.out.println(num>>1); //50  250
		System.out.println(num>>2); //25  125
		System.out.println(num>>3); //12  62
		
		
		System.out.println(num<<1);//200
		System.out.println(num<<2);//400
		System.out.println(num<<3);//800
		
		System.exit(0);
		
				
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // 1.7 --> 10 capacity
		
		System.out.println("Arraylist--. ");
		for(int i=1;i<25;i++) {
			numbers.add(ThreadLocalRandom.current().nextInt(1,100));	// first element added --> // 1.8 --> 10 capacity
			if(i%5==0) {
				numbers.remove(0);
				numbers.set(0, 44); // modifies the element of given index
			}
		}
		
		
		//fill ratio -- 100% --- > load factor -- > 100% -- full internal array
		// arrays.copyof -->  cp  + cp >>1 --> 
		
		
		
		int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
  
        
        System.arraycopy(s, 1, d, 0, 5);		// System.arraycopy

        
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(d));
        
        
        System.exit(0);
        
        
        
		int nums[] = new int[5];
		
		nums[0] = 101;
		nums[1] = 102;
		nums[2] = 103;
		nums[3] = 104;
		nums[4] = 105;
		
		
		nums = Arrays.copyOf(nums, 7);
		nums[5] = 106;
		nums[6] = 107;
		System.out.println("After Grow --> " +Arrays.toString(nums));
		
		
		System.arraycopy(nums, 2, nums, 5, 5);
		
		
		System.out.println("Before Grow --> " +Arrays.toString(nums));
		
			
		
		System.exit(0);
		
		
	}
}
