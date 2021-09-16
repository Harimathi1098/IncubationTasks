package com.Demonstration;

class A
{
	public synchronized void amethod(B b)
	{
		System.out.println("Thread1 starts execution of amethod()" ); 
		try 
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread1 trying to call b last method");
		b.last();
	}
	 	 public synchronized void last()
	 {
		 System.out.println("This is A's Last Method");
	 }
}
class B
{
	public synchronized void bmethod(A a)
	{
		System.out.println("Thread2 starts execution of bmethod()" );
		try 
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("Thread1 trying to call a last method");
		a.last();
	}
	
	public synchronized void last()
	 {
		 System.out.println("This is B's Last Method");
	 }
}
public class Demo2 extends Thread {
	A a =new A();
	B b=new B();
	public void method()
	{
		this.start();
		a.amethod(b);
		
	}
	public void run()
	{
		b.bmethod(a);
	}
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.method();
	}

}
