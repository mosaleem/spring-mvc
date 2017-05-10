package test;

public class Boobleshort {
 static void booblesort(int[] s){
	 int n =s.length;
	 int temp=0;
    for(int i=0;i< n;i++){
    	for(int j=1; j<(n-i);j++){
    		if(s[j-1] > s[j]){
    	          temp = s[j-1];  
                  s[j-1] = s[j];  
                  s[j] = temp;  	
    		}
    	}
    }
 }
	public static void main(String a[]){
		int s[]={2,3,1,6,6,7};
		System.out.println("Befor Booble sort");
		for(int i=0;i < s.length;i++){
			System.out.println(s[i]);
			
		}
		
		booblesort(s);

		System.out.println("Befor Booble sort");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			
		}
		
		
		
		
	}
	
	
	
}
