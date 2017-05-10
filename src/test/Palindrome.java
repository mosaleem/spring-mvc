package test;
import java.util.Scanner;
class Palindrome 
{
public static void main(String[] args) 
{
int a,no=121,b,temp=0;
//Scanner s=new Scanner(System.in);
//System.out.println("Enter any num: ");
//no=s.nextInt();


b=no;
System.out.println("Enter any num: "+b);
while(no>0)
{
	
	
a=no%10;
System.out.println("Enter any num a : "+a);


no=no/10;

System.out.println("Enter any num no : "+no);


temp=temp*10+a;

System.out.println("Enter any num temp : "+temp);
}



if(temp==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
System.exit(0);
}
}


