package test;
import java.util.Scanner;
public class Armstrong {

	public static void main (String[] args){
		int a=0,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any  num:");
		d=s.nextInt();
	
		c=d;
		while(d>0){
			
			b=d%10;
			d=d/10;
			a=a+(b*b*b);
			
			
		}
		if(c==a){
		System.out.println("Armstrong");	
			
		}else{
		System.out.println("Not Armstrong");	
			
		}
	}
}
