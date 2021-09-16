package com.Demonstration;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashtabledemo {
public static void main(String[] args) {
	Hashtable hash=new Hashtable();
	 
	    hash.put(1, "hello");
	    //hash.put(null,"Haran"); 		    
	   
	    //hash.put(3,"null"); 
	    
	    hash.put(4,"World"); 
	    
	    hash.put(5, "success");
	    System.out.println("The value present at a key --> "+hash.get(4));
	    
	    System.out.println(" ");
	    
	    System.out.println("The removed value is -->  "+hash.remove(1));
	    
	    System.out.println(" ");
	    
	    System.out.println("Whether the key present or not -->  "+ hash.containsKey(6));
	    
	    System.out.println(" ");
	    
     System.out.println("Whether the value present or not -->  "+ hash.containsValue("success"));
	    
	    System.out.println(" ");		    
	    
	    System.out.println("The contents of HashMap -->"+hash);  		    		    
	   
	    System.out.println(" ");		    
	    
	    System.out.println("The contents of HashMap is empty or not-->"+hash.isEmpty());
	    
     System.out.println(" ");		    
	    
	    System.out.println("The size of HashMap-->"+hash.size());  	   
	    
	    System.out.println();
	    Set keyset=hash.keySet();
	    
	    System.out.println("key");
	    System.out.println();
	    System.out.println(keyset);
	    
	    Collection values=hash.values();
	    System.out.println();
	    System.out.println();
	    System.out.println("values");
	    System.out.println();
	    System.out.println(values);
	    System.out.println();
	    System.out.println();
	    Set set=hash.entrySet();
	    
	    Iterator iter=set.iterator();
	    
	    System.out.println("The contents of the map are as follows: ");
	    while(iter.hasNext())
	    {
	    	Map.Entry ma=(Map.Entry)(iter.next());
	    	System.out.println(ma.getKey()+" "+ma.getValue());
	    	
	    }
}
}
