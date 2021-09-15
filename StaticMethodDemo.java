package com.incubtasks;
class demo 
{
	int variable=10;
	public void overDemo()
	{
		System.out.println("Parent class");
	}
	public static void staticDemo()
	{
		
		System.out.println("Parent class Static Method");
	}
	public static void main(String[] args) {
		StaticMethodDemo demo1=new StaticMethodDemo();
		//demo1.staticDemo();
		
	
	}
}
 public class StaticMethodDemo extends demo {
	 public void overDemo()
		{
			System.out.println("Child class");
		}
	public static void staticDemo()
	{
		System.out.println("Static method");
	}
	public void instanceDemo()
	{
		System.out.println("Instance Method");
	}
public static void main(String[] args) {
	//StaticMethodDemo.staticDemo();
	StaticMethodDemo demo=new StaticMethodDemo();
	demo.staticDemo();
	
	demo demo1=new demo();
	
	demo1.staticDemo();
	
	demo demo2=new StaticMethodDemo();
	demo2.staticDemo();
	
	

	demo.overDemo();
	demo1.overDemo();
	demo2.overDemo();
	
	
}
}
