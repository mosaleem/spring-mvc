package test;

import java.util.Scanner;

public class Reverse {

	public static void main (String[] args){
		int n,temp,rev=0,r;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num:");
		n=s.nextInt();
		
		
		
		temp=n;
		while(n>0){
			r=n%10;
			n =n/10;
			rev=(rev*10)+r;
		
		}
		System.out.println("Reverse Value  " +rev);
		
		if(temp==rev){
			System.out.println("Palindrome");	
			
		}
		else{
			System.out.println("Not Palindrome");	
			
		}
	}
	
	
	
}
