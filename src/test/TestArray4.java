package test;

public class TestArray4{ 
	int rollno;
	String name;
	static String college="Jain College";
	
	static void change(){
		
	 college ="maharaja college";	
	}
	
	TestArray4(int r,String n){
		rollno=r;
		name=n;
	}

	void display (){
	System.out.println("Name   "+name+ "   Roll No  "+rollno+" College  "+college);
	
}
public static void main(String args[]){ 
	TestArray4.change();
	TestArray4 t1=new TestArray4(02,"raj");
	TestArray4 t2=new TestArray4(01,"Shyam");
	TestArray4 t3=new TestArray4(03,"Rakesh");
	TestArray4 t4=new TestArray4(04,"Amit");
	
	t1.display();
	t2.display();
	t3.display();
	t4.display();
}}