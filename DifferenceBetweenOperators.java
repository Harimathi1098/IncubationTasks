package com.incubtasks;

public class DifferenceBetweenOperators {
	public static void main(String[] args) {
		int integer1=10;
		int integer2=20;
		int integer3=10;
		
		String string1=new String("hariharan");
		String string2=new String("hariharan");
		String string3=string1;
		
		
		System.out.println("integer1==integer2 "+(integer1==integer2));
		System.out.println("integer1==integer3 "+(integer1==integer3));
		
		System.out.println("String1 == string2 "+(string1==string2));
		System.out.println("String1 == string3 "+(string1==string3));	
		
		
		
		
		
		
		System.out.println("String1 equals string2 "+string1.equals(string2));
		//System.out.println(integer1.equals(integer2));
		
		
		
		
		//System.out.println("integer1==integer3 "+(integer1==string1));
		System.out.println("String1 equals integer1 "+string1.equals(integer1));
		
		System.out.println("string1==null "+ (string1==null));
		System.out.println("string1.equals(null) "+string1.equals(null));
		
		
	}

}
