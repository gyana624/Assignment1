package gyana15;

public class Swapping 
{

	public static void main(String[] args) 
	{
		int[] num= {50, -20, 0, 30, 40, 60, 10};
		int temp=0;
		System.out.println("Before swapping array element: ");    
        for (int i = 0; i < num.length; i++)
        {     
        	System.out.print(num[i]+" ");   
        }  
		
		temp=num[0];
		num[0]=num[6];
		num[6]=temp;
		System.out.println("After swapping array element: ");    
        for (int i = 0; i < num.length; i++)
        {     
        	System.out.print(num[i]+" ");   
        }  
	}

}
