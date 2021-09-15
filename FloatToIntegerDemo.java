package com.incubtasks;

public class FloatToIntegerDemo {
	public static void main(String[] args) {
		Float value=10.56f;
		Integer integer=value.intValue();
		System.out.println(integer);
		 
		float va=10.56f;
		Integer in=(Float.valueOf(va)).intValue();
		System.out.println(in);
		
		int i=10;
		float f=(Integer.valueOf(i)).floatValue();
		System.out.println(f);
		
		float f1=(float)i;
		System.out.println(f1);
	}
	
	

}
