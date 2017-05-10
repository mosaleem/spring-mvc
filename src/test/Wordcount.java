package test;

import java.util.Scanner; 

public class Wordcount {

	public static void main(String args[])
	{
	int count=0;
	System.out.println("enter your Word");
	 Scanner in = new Scanner (System.in);
     String s=in.nextLine();

	String[] arr=s.split(" ");
	for (int i = 0; i < arr.length; i++)
	{ 
	count++;
	} 
	System.out.println(count);
	}
	}

