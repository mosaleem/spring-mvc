package test;

import java.util.Scanner;


public class Prime {

public static void main(String agrs[]){
int i,fact=1;
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter any num:");
n=s.nextInt();
for(i=1;i<=n;i++){
	fact=fact*i;
	
	
}
System.out.println("Factorial of "+n+" is "+fact);

}
}
