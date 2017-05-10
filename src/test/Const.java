package test;

public class Const {
int age;
String name;
Const(String n,int a){
	
age=a;
name=n;


}

Const(Const C){
	name=C.name;
	age=C.age;
	
}
public void display(){
	
	System.out.println("Your Name is "+name + "  and Age is "+age);
}


	public static void main(String args[]){
	Const co=new Const("Sahil raiyan",21);
	Const co1=new Const(co);
	co.display();
	co1.display();
		
		
	}
	
}
