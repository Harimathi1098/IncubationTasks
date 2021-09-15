package com.incubtasks;

public class Student {
   int rollno;
   String name;
   static String collegename;
   int totalmarks;
   public void add(int totalmarks)
   {
	   int totalsubject;
	 int average=totalmarks/totalsubject;
   }
   public static void main(String[] args) {
	Student s=new Student();
	
	System.out.println(s.collegename);
	System.out.println(Student.collegename);
}
}
