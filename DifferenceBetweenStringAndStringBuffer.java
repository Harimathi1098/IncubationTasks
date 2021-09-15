package com.incubtasks;
import java.util.Scanner;
public class DifferenceBetweenStringAndStringBuffer {
	public static void main(String[] args) {
		
	//String objects	
	String string1="hari";
	string1.concat("haran");
	String string2=new String("hari");
	String string3=new String("hari");
	
	
	System.out.println(string1);
	
	//StringBuffer Objects
	StringBuffer stringbuffer1=new StringBuffer("hari");
	stringbuffer1.append("haran");
	System.out.println(stringbuffer1);
	StringBuffer stringbuffer2=new StringBuffer("hari");
	StringBuffer stringbuffer3=new StringBuffer("hari");
	StringBuffer stringbuffer4=stringbuffer1;
	
	
	
	
	System.out.println(string2.equals(string3));
	System.out.println(stringbuffer2.equals(stringbuffer3));
	System.out.println(stringbuffer4.equals(stringbuffer1));//reference
	
	}
	
}
