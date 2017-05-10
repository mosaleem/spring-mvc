package test;

public class FibonacciSeries {
public static void main(String args[]){

int a=0,b=1,c,i,count=10;
System.out.print(a+" "+b);

for(i=1;i<count;++i){
	c=a+b;
	if(c<=20){
	System.out.print(" "+c);
	a=b;
	b=c;
	}
}
}
}
