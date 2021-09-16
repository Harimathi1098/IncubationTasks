package com.Demonstration;

import java.util.*;
import java.io.*;
public class PropDemo  {
	public static void main(String[] args)throws IOException
	
	{
		Properties property=new Properties();
		FileReader input=null;
		try
		{
		input =new FileReader("hello.properties");
		}
		catch(Exception e)
		{
			System.out.println("Exception cauaght");
		}
	    property.load(input);
	    System.out.println(property);
	    String string=property.getProperty("hello");
	    System.out.println("The property value for hello "+string);
	    property.setProperty("success", "1000");
	    FileWriter output=new FileWriter("hello.properties");
	    property.store(output, "Changed by me today");
	     
		
		
	
	}

}
