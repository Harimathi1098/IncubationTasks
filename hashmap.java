package com.incubtasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class hashmap {
	public static void main(String[] args) {
		 HashMap hash=new HashMap();

		 
		    System.out.println("The return value when new entry is added --> " +hash.put(1,"Hari")); 
		    	    
		    System.out.println(" ");
		    
		    hash.put(2,"Haran"); 		    
		   
		    hash.put(3,"Hello"); 
		    
		    hash.put(4,"World"); 
		    
		    System.out.println("The value present at a key --> "+hash.get(2));
		    
		    System.out.println(" ");
		    
		    System.out.println("The removed value is -->  "+hash.remove(2));
		    
		    System.out.println(" ");
		    
		    System.out.println("Whether the key present or not -->  "+ hash.containsKey(3));
		    
		    System.out.println(" ");
		    
            System.out.println("Whether the value present or not -->  "+ hash.containsValue(4));
		    
		    System.out.println(" ");		    
		    
		    System.out.println("The contents of HashMap -->"+hash);  		    		    
		   
		    System.out.println(" ");		    
		    
		    System.out.println("The contents of HashMap is empty or not-->"+hash.isEmpty());
		    
            System.out.println(" ");		    
		    
		    System.out.println("The size of HashMap-->"+hash.size());  	   
		    
		    Set keyset=hash.keySet();
		    
		    System.out.println(keyset);
		    
		    Collection values=hash.values();
		    
		    System.out.println(values);
		    
		    Set set=hash.entrySet();
		    
		    Iterator iter=set.iterator();
		    
		    while(iter.hasNext())
		    {
		    	Map.Entry=
		    }
		   		    
		    hash.clear();
		    
		
	}
   
}
