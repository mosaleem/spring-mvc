package test;

public class DectoBin {
public static void main(String ds[]){
	int decimal=12;
	System.out.println(decimalToBinary(decimal));
}

public static String decimalToBinary(int decimal)

{

String binary="";
while(decimal!=0)
{
binary=(decimal%2)+binary;

decimal/=2;

}

return binary;

}
}