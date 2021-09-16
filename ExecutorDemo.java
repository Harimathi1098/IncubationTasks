package com.Demonstration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Print implements Runnable {
	
	
		String name;
		Print(String name)
		{
          this.name=name;
		}
		public  void run()
		{
			System.out.println(name+ " Job Started  By thread"+Thread.currentThread().getName());
			try
			
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(name+"  Job completed by Thread:"+Thread.currentThread().getName());
		}

		

	}

public class ExecutorDemo
{
	public static void main(String[] args) {
		Print[] print= {new Print("Hari"),
		new Print("Haran"),
		new Print("Hello"),
		new Print("world"),
		new Print("Good"),
		new Print("Success")};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(Print p:print)
		{
			service.submit(p);
		}
		service.shutdown();
	}
}