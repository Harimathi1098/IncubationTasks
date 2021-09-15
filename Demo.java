package com.incubtasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap hash=new HashMap();
		hash.put(1,"hari");
		hash.put(2,"haran");
		hash.put(3,"hello");
		hash.put(4,"world");
		System.out.println(hash);
		
		System.out.println("The key are");
		System.out.println(hash.keySet());
		
		
		System.out.println(hash.values());
		System.out.println();
		
		Iterator iter=hash.iterator();
		
}
}