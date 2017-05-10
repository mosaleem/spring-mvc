package test;

public class SwappingWithoutContainer {

	public static void main(String[] args){
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("first a "+a );
	System.out.println("first b "+b );
	}
}
