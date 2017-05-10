package test;

public class Good {
	public static void main(String[ ] args) {
		 try {
		   System.out.println("This line is printed .....");
		   //endless loop
		   while(true){
		     //...
		   }
		 }
		 finally{
		   System.out.println("Finally block is reached."); // won't reach
		 }
		}
}
