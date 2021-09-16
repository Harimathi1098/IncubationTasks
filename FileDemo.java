package com.Demonstration;
import java.io.*;
public class FileDemo {
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\Hariharanmathi\\Desktop","hari.txt");
	//file.createNewFile();
	
	//System.out.println(file.exists());
	
	FileWriter filewriter=new FileWriter(file,true);
	
	//System.out.println(file.exists());
	
	/*filewriter.write(100);
	filewriter.write("This is an example statement");
	char[] characterarray= {'h','a','r','i'};
	filewriter.write(characterarray);
	filewriter.flush();
	filewriter.close();*/

	FileReader filereader=new FileReader(file);
	
	/*int i=filereader.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=filereader.read();
		
	}*/
	
	//System.out.println(filereader.read(ch));
	/*char characterarray1[] =new char[(int)file.length()];
	filereader.read(characterarray1);
	for(char character:characterarray1)
	{
		System.out.print(character);
		
	}*/
	
	/*BufferedWriter buffer=new BufferedWriter(filewriter);
	buffer.write(100);
	buffer.newLine();
	buffer.write("This is an example statement");	
	char[] characterarray2= {'h','a','r','i'};
	buffer.newLine();
	buffer.write(characterarray2);
	buffer.newLine();
	buffer.flush();
	buffer.close();
	
	
	BufferedReader bufferreader=new BufferedReader(filereader);
	int i=bufferreader.read();
	String line=bufferreader.readLine();
		while(line!=null)
	{
		System.out.println(line);
		line=bufferreader.readLine();
	}*/
	
		
	PrintWriter print=new PrintWriter(filewriter);
	print.print(15.6);
	print.println('h');
	print.println("Hariharan");
	print.println(100);
	
	print.flush();
	print.close();
	

	
	
}
}
