package gyana10;

class digit
	{
	void digitsum(int x)
	{
		int sum=0;
	while(x!=0)
		{
		int rem=x%10;
		
		sum=sum+rem;
		x=x/10;
		}
//	return sum;
		System.out.println(sum);
	}
	}
	
	


public class Sum_of_digit
	{

	public static void main(String[] args)
	{
		digit ironman=new digit();
	ironman.digitsum(25);
	}

}
