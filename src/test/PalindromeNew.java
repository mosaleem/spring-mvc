package test;
import java.util.Scanner;

public class PalindromeNew {

public static void main(String[] args) 
	{
int a=121,b,c,d=0;
b=a;
System.out.println("b "+b);
while(a>0){
c=a%10;
System.out.println("c "  +c);
a=a/10;
d=d*10+c;
System.out.println("d  "  +d);
}
if(d==b){
	System.out.println("Palindrome");
	
}else{
	
	System.out.println("Not Palindrome");	
}
	
	}
}
