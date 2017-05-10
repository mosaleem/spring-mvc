package test;
public class Nonrep {
	// Non repited number 

	    public static void main(String[] args) 
	    {
	        int flag = 0;
	        int a[] = {2,3,4,5,3,2,6};
	          for(int i = 0; i < a.length; i++)
	        {
	            for(int j = 0; j < a.length; j++)
	            {
	                if(i != j)
	                {
	                    if(a[i] != a[j])
	                    {
	                        flag = 1;
	                    }
	                    else
	                    {
	                        flag = 0;
	                        break;
	                    }
	                }
	            }
	            if(flag == 1)
	            	
	            {
	    
	                System.out.print(a[i]+" ");
	            }
	        }
	        
	    }
	}