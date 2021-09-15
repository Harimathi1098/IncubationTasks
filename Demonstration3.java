package com.incubtasks1;
import com.incubtasks.Demonstration2;
public class Demonstration3 extends Demonstration2{
	protected Demonstration3()
	{
	}
	 void toCheckPrivateModifier()
	{
		System.out.println("private");
	}
	/*public void toCheckProtectedModifier()
	{
		System.out.println("Protected");
	}*/
public static void main(String[] args) {
	Demonstration3 demo3=new Demonstration3();
	Demonstration2 demo2=new Demonstration2();
	
	demo3.toCheckProtectedModifier();
	demo3.protectedvariable="Child Protected";
	/*demo2.toCheckDefaultModifier();
	demo2.toCheckPrivateModifier();//Parent References
	demo2.toCheckProtectedModifier();*/
	
		
	/*System.out.println(demo2.defaultvariable);
	System.out.println(demo2.privatevariable);
	System.out.println(demo2.protectedvariable);*/
	System.out.println(demo2.publicvariable);
		
}
}
//Non Child Class
class demo5
{
	public static void main(String[] args) {
		/*Demonstration2 demo=new Demonstration2();
		demo.toCheckPublicModifier();
		demo.tocheckPrivateModifier();
		demo.toCheckProtectedModifier();
		demo.toCheckDefaultModifier();
		
		
		System.out.println(demo.defaultvariable);
		System.out.println(demo.privatevariable);
		System.out.println(demo.protectedvariable);
		System.out.println(demo.publicvariable);
			*/
			
	}
}