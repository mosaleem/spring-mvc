package test;

class Bike{  
	  void run(){System.out.println("running");}  
	}  
	public class Ex extends Bike{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Bike b = new Bike();//upcasting  
	    b.run();  
	  }  
	} 