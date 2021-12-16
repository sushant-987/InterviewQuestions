package com.demo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetImpl {
		
	public static void main(String[] args) {
		setImpl();
	}
	
	private static void setImpl() {
		
		hashsetImpl();
		linkedHashsetImpl();
		treeSetImpl();
	
	}

	private static void treeSetImpl() {
		
	}

	private static void linkedHashsetImpl() {
		
	}

	private static void hashsetImpl() {
		Set<Integer> values = new HashSet<Integer>(); // hashtable
		values.add(10);
		values.add(120);
		values.add(1230);
		values.add(4);
		values.add(10);
		
		System.out.println(values);
		
		Emp e1 = new Emp(101,"XXX",1290.24);
		Emp e2 = new Emp(101,"XXX",1290.25);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Set<Emp> emps = new HashSet<Emp>();
		emps.add(e1);
		emps.add(e2);
		
		System.out.println(emps);  // which one ??
		
		System.out.println(e1 == e2); // ref equality
		System.out.println(e1.equals(e2)); // content equality [overriden equals] -->
													// object --> equals ---. ref
		
	}
}

class Emp{
	private int empId;
	private String empName;
	private double empSalary;
	public Emp(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31; // uniform distribution -> 
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
}
}


/**
	Collection -->
				hom + hetro --> Data elements
				Growable in nature
				Every class has backend DataStructure
				Only objects are allowed --> reason -- collection- backed by Generics Concept
	List --> 
				Duplicates Allowed
				Seq maintained
				Multiple Nulltypes allowed
				
			AL
					() (int) (coll)
					capacity -- > 10
					eager loading/lazy loading[1.7]
					not thread safe					---> Collections.synechronizedList(al)
					arrays.copy --> 
								cp+cp>>1   >=1.7
								cp*3/2+1 --> <1.7
					Array---> index based operations
					Better - - for searching retrival operations
					fill ratio -- 100%
			LL
					()(coll) -->
							Grow/Capacity -- NA
					DS -> Doubly Linkedlist --> 	node [prev data next]
					Better --> Insertion deletaion
					Worst --> Searching /retrival -- always starts from head node
					Not Threadsafe --> not sync ---> CollectionSynechronizeList(ll)
					
			vector	
					()	()	()		(int,int) : fill ratio : 100%--can be changed
					size --> doubles
					sync - Thread Safe
					array --> 
					better -- searching retrival-->
					single threaded env - slow 
					
				Stack
						thread safe -> 
							single constructor --> uses the properties inherited from --> Vector.
							
	Set -->
				Duplicates Not Allowed
				Single NullType Allowed
				Sequence not maintained
				None of the class is Sync..  ---> Collections.synechrozedSet(setobj)
				
		HashSet: class --> 1.2 --->       hashtable
		   LinkedHashset : class : 1.4    hashtable + doubly linkedlist
		   									linkehashet -->
		   												seq preserve-- backend--hashtable
		SortedSet: interface : 1.2
			NavigableSet:interface : 1.6
				TreeSet:class:1.2 		  balancedtree
			


/**
	Instance -- > Object --> Perticular
	Static --> Common for All Objects --> 


Thread --> Lightweight Process --> Worker --> task
		--> Task --> Run 
				Start --> Thread SCHEDULAR--REgister ---> OS --> Core --> 
								Run MEthod la execute karel.
	
Start--> start--> thread la register --> thread schedular--> OS system pick for execution
Run		--> run method holds the task for Thread


*/

*/