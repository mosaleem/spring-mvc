package test;

public class Srt {
public static void main(String args[]){
	
	String str ="java";
	StringBuilder st= new StringBuilder(str);
	System.out.println(st.reverse());
	
	System.out.println(Stringrev(str));
	
}	
	static String Stringrev(String str){
	if((null==str) || (str.length() <=1)){

	return str;
	}
	System.out.println("ddddd"+Stringrev(str.substring(1)));
	System.out.println("Sahil"+str.charAt(0));
	return Stringrev(str.substring(1))+str.charAt(0);
	
}


}
