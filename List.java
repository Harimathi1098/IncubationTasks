package com.incubtasks;

import java.util.*;

public class List {
  public static void main(String[] args) {
	
	  
	  ArrayList arraylist=new ArrayList();
	  arraylist.add("A");
	  arraylist.add(10);
	  arraylist.add("A");
	  arraylist.add(null);
	  
	  System.out.println("The items in arraylist: ");
	  System.out.println(arraylist);
	  
	  arraylist.remove(2);
	  arraylist.remove(null);
	  
	  System.out.println("The items in arraylist: ");
	  System.out.println(arraylist);
	  
	  System.out.println("The first element after deletion is  "+arraylist.get(0));
	  
	  arraylist.set(1,null);
	  
	   ListIterator iterator=arraylist.listIterator();
	   System.out.println("Elements printed by ListIterator");
	   while(iterator.hasNext())
	   {
		   System.out.println(iterator.next());
		   
		     }
	   System.out.println("Elements printed by Iterator");
	   Iterator iter=arraylist.iterator();
	   while(iter.hasNext()) {
		   System.out.println(iter.next());
	   }
			   
	   
	   
	   
	   
	  
}
}
