package test;

public class Student{  
    int age;
    String name;
    void insert(int a,String n){
    age=a;
    name =n;
    	
    }
    void display(){
    	
    	System.out.println(age+" "+name);
    }
    public  static void main(String args){
    Student s=new Student();
    
    s.insert(11, "saif");
    
    
    s.display();	
    }
	
	}  

