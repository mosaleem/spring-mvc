package test;

public class BintoDEc {
public static void main(String args[]){
	int num=11;
	System.out.println(binaryToDecimal(num));
}


public static int binaryToDecimal(int num){

if(num < 2){

return num;

}else{

return binaryToDecimal(num/10)*2 + num%10;

}
}
}