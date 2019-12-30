package gyana4;


class Result
{
	void cal(int x,int y) 
	{
		System.out.println("First number is:\t"+x);
		System.out.println("Second number is:\t"+y);
int p=x*y;
System.out.println("Product of two numers:\t" +x+"*"+y+"="+p);
	}
	

}

public class Calculate 
{

	public static void main(String[] args)
	{
		Result a1=new Result();
		a1.cal(25, 5);
	}

}
