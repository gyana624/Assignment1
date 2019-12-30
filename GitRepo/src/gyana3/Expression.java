package gyana3;


class Result
	{
		void exp1(int x,int y,int z) 
		{
	int p=x+y*z;
	System.out.println("First expression result:\t"+p);
		}
		void exp2(int x,int y,int z) 
		{
			int p=(x+y)%z;
			System.out.println("Second expression result:\t"+p);
		}
		void exp3(int x,int y,int z,int a) 
		{
			int p=x+y*z/a;
			System.out.println("Third expression result:\t"+p);
		}
		void exp4(int x,int y,int z,int a,int b,int c) 
		{
			int p=x+y/z*a-b%c;
			System.out.println("Fourth expression result:\t"+p);
		}

	}
public class Expression 
{

public static void main(String[] args) 
		{
		
		Result b1=new Result();
		b1.exp1(-5,8,6);
		b1.exp2(55,9,9);
		b1.exp3(20,-3,5,8);
		b1.exp4(5,15,3,2,8,3);
		}
}

