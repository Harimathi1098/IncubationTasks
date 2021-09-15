package com.incubtasks;

public class StudentDemo {
	
		
		int rollno;
		String name;
		StudentDemo(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
			
		}
		/*public String toString()
		{
			return name+" "+rollno;
		}*/
		public static void main(String[] args) {
			StudentDemo student1=new StudentDemo(101,"Hari");
			StudentDemo student2=new StudentDemo(102,"Haran");
			System.out.println("The student1 reference   "+student1);
			System.out.println("The student2 reference   "+student2);
			
		}
		
	}


