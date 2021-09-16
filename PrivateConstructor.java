package com.Demonstration;

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
				public class Demo
				{
					public static void main(String[] args) {
						Runtime r1=Runtime.getRuntime();
						Runtime r2=Runtime.getRuntime();
						Runtime r3=Runtime.getRuntime();
						Runtime r4=Runtime.getRuntime();
						
						
						System.out.println(r1.hashCode());
						System.out.println(r2.hashCode());
						System.out.println(r3.hashCode());
						System.out.println(r4.hashCode());
					}
					

}