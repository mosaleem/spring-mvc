package test;


	public class Revnum{
	public static void main(String agrs[]){
	String str="java";
	

	System.out.println(revb(str));
	
	}
	static String revb(String str){
		if( (null==str) || (str.length()<=1) ){
			return str;	
		}
		
		return revb(str.substring(1))+str.charAt(0);
		
		
	}
	
	}