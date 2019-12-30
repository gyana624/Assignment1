package gyana6;

class Result
	{
	void table(int x)
	{
			System.out.println("Enter a Number:\t"+x);
			for(int i=1;i<=10;i++)
			{
				System.out.println(x+"x"+i+"="+(x*i));
			}
			
		
	}
	
	}



public class Table 
{

	public static void main(String[] args)
	{
	Result dude=new Result();	
	dude.table(8);

	}

}
