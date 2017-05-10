package test;

public class ReverseString12 {

    public static void main(String[] args)
    {
        String str = "MyJava";
     System.out.println(recursiveMethod(str));    //Output : avaJyM
}

static String recursiveMethod(String str)
{
     if ((null == str) || (str.length() <= 1))
     {
            return str;
     }

     return recursiveMethod(str.substring(1)) + str.charAt(0);
}
}
