package gyana11;

class Result
{
	void rev(String x)
	{
		System.out.println("Input a Word:\t"+x);
		String reverse = "";
		
		int length = x.length();
		for (int i = length - 1 ; i >= 0 ; i--)
		      reverse = reverse + x.charAt(i);

		    System.out.println("Reverse Word:\t " +reverse);

	}
}


public class Reverse 
{

	public static void main(String[] args) 
	{
		Result doke=new Result();
		doke.rev("dsaf");

	}

}
