package test;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) 
	{ 
		Scanner firstname = new Scanner(System.in);
		System.out.println("Please enter your first name:");
        String test = firstname.next();
	   // String test = "ab19198zxncvl1.308j10923.";
	   	String digits = test.replaceAll("[^A-Za-z]", "");
	    System.out.println( digits ); //returns 19198.130810923.
	}
}
