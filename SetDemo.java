package com.incubtasks;
import java.util.*;
public class SetDemo {
  public static void main(String[] args) {
	
	  HashSet set=new HashSet();
	  set.add("a");
	  set.add("b"); 
	  set.add(null);
	  set.add("z");
	  set.add("a");
	  
	  set.remove(0);
	  System.out.println("the elements of hashset");
	  System.out.println(" ");
	  System.out.println(set);
	  System.out.println(" ");
	  System.out.println(" ");
	  
	  
	 LinkedHashSet set1=new LinkedHashSet();
	 
	  set1.add("a");
	  set1.add("b"); 
	  set1.add(null);
	  set1.add("z");
	  System.out.println(set1.add("a"));
	  
	  
	  set1.remove(2);
	  System.out.println(" ");
	  System.out.println("the elements of linkedhashset");
	  System.out.println(" ");
	  System.out.println(set1);
	  
	  
	  
	  TreeSet set2=new TreeSet();
	  
	  
	  
	  set2.add("p");
	  set2.add("b"); 
	 // set2.add(null);
	  set2.add("z");
	  set2.add("a");
	  //set2.add(7);
	  
	  System.out.println(" ");
	  System.out.println("the elements of treeset");
	  System.out.println(" ");
		System.out.println(set2);	  
	  
}
}
