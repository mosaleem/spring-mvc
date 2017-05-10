package test;
interface A{
void a();
void b();
void c();
void d();
	
}
abstract class B implements A{
public void c(){
	System.out.println("I m C");
}
	
}

class M extends B{  
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}
public class Operation{
public static void main(String arg[]){
	A o=new M();
	o.a();
	o.b();
	o.c();
	o.d();
	
}	
}


