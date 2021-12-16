package com.demo.collection;

import java.util.*;

public class GFG {
  
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();
  
        al.add("ABC");
        al.add("XVZ");
        al.add(1, "Good");
    /*    al.addAll(al);
        al.addAll(0, al);
        al.contains(0);
       al.equals(al);
    
        */
        al.remove(2);
        
  
        System.out.println(al);
  
       ;
    }
}