package com.incubtasks;

public class Exception {
public static void main(String[] args) {
	System.out.println("line1");
	try
	{
	System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println("Arithmetic Exception arised");
		System.out.println(10/1);
	}
	finally
	{
		System.out.println("Inside finally block");
	}
	System.out.println("line3");
}
}
