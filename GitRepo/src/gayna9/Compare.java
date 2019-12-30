package gayna9;

class Result
	{
	void compare(int x,int y)
	{
		System.out.println("\t"+x+"!="+y);
		System.out.println("\t"+x+"<"+y);
		System.out.println("\t"+x+"<="+y);
	}
	
	}

public class Compare 
{

	public static void main(String[] args) 
	{
		Result boat=new Result();
		boat.compare(25,39);

	}

}
