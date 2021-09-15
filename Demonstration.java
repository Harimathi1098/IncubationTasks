
package com.incubtasks;



class Demo1{

		private Demo1()
					{
						
					}
					private static  Demo1 demo=new Demo1();
					public static Demo1 getDemonstration()
					{
						return demo;
					}

				}
				public class Demonstration
				{
					public static void main(String[] args) {
						Demo1 r1=Demo1.getDemonstration();
						Demo1 r2=Demo1.getDemonstration();
						Demo1 r3=Demo1.getDemonstration();
						Demo1 r4=Demo1.getDemonstration();
						
						System.out.println("Hashcode for the demo1 objects");
						System.out.println(r1.hashCode());
						System.out.println(r2.hashCode());
						System.out.println(r3.hashCode());
						System.out.println(r4.hashCode());
					}
					

}





