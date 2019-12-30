package gyana;

class Result
	{
	void add(int x,int y)
	{
		System.out.println("First number is:"+x);
		System.out.println("Second number is:"+y);
		int z=x+y;
		System.out.println("Sum of two numbers is:"+z);
	}
	
	}


public class Addition
{

	public static void main(String[] args)
	{
		Result obj=new Result();
		obj.add(74,36);
	}

}
