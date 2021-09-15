package com.incubtasks;

public class Throws {
public static void main(String[] args) throws InterruptedException {
	System.out.println("hello");
	//try
		{
	Thread.sleep(3000);
	}
	/*catch(InterruptedException e)
	{
		System.out.println("Caught Exception");
	}*/
		System.out.println("hello");
}
}
