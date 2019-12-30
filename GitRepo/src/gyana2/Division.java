package gyana2;

class Result
{
void add(int x,int y)
{
	System.out.println("First number is:"+x);
	System.out.println("Second number is:"+y);
	int z=x/y;
	System.out.println("Division of\t"+x+"/"+y+"="+z);

}

}


public class Division 
{

	public static void main(String[] args) 
	{
	
Result a1=new Result();
a1.add(50, 3);
	}

}
