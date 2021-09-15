package com.incubtasks;

/*class Demo4 extends Demonstration2
{
	public static void main(String[] args) {
		/*Demo4 demo=new Demo4();
		Demonstration2 demo2=new Demonstration2();
		demo2.toCheckDefaultModifier();
		demo2.toCheckProtectedModifier();
		demo.toCheckProtectedModifier();
		//demo2.toCheckPrivateModifier();
		demo2.toCheckPublicModifier();
		
		
		System.out.println(demo2.defaultvariable);
		//System.out.println(demo2.privatevariable);
		System.out.println(demo2.protectedvariable);
		System.out.println(demo2.publicvariable);
			
	}
}*/

	
	/*String defaultvariable="default";
	public String publicvariable="public";
	protected String protectedvariable="protected";
	private String privatevariable="private";
	public void toCheckPublicModifier()
	{
		System.out.println("Public");
	}
	void toCheckDefaultModifier()
	{
		System.out.println("Default");
	}
	private void toCheckPrivateModifier()
	{
		System.out.println("Private");
	}
	protected void toCheckProtectedModifier()
	{
		System.out.println("Protected");
	}*/
public class Demonstration2 {
	int demovariable;
	public Demonstration2()
	{
		this.demovariable=demovariable;
	}
	public static void modifyDemoVariable(Demonstration2 var)
	{
		var.demovariable=100;
	}
	public static void modify(int[] arr)
	{
	arr[0]=12;
	arr[1]=10;
	}
	public static void modify(int integer1,int integer2)
	{
		integer1=integer2-integer1;
		integer2=integer2+integer1;		
		
	}
	public static void modify(String s)
	{
		s=s.concat("world");
	}
	public static void modify(StringBuffer sb)
	{
		sb.append("world");
	}
	public static void main(String[] args) {
		
		int integer1=10;
		int integer2=20;
		System.out.println("The values before modification of the primitive int datatype: "+integer1+" "+integer2);
		modify(integer1,integer2);
		System.out.println("The values after modification of the primitive int datatype: "+integer1+" "+integer2);
		int array[]= {1,2,3,4,5};
		System.out.println("The values before modification of the array: ");
		for(int i:array)
		{
		System.out.println(i);
		}
		modify(array);
		System.out.println("The values after modification of the array: ");
		for(int i:array)
		{
		System.out.println(i);
		}
		String string=new String("hello");
		System.out.println("The values before modification of the string: "+string);
		modify(string);
		System.out.println("The values after modification of the string: "+string);
		StringBuffer stringbuffer=new StringBuffer("hello");
		System.out.println("The values before modification of the stringbuffer: "+stringbuffer);
		modify(stringbuffer);
		System.out.println("The values after modification of the stringbuffer: "+stringbuffer);
		
		Demonstration2 demo=new Demonstration2();
		System.out.println("The values before modification of the demovariable");
		System.out.println(demo.demovariable);
		modifyDemoVariable(demo);
		System.out.println("The values after modification of the demovariable");
		System.out.println(demo.demovariable);
		
		
			
	}

}
