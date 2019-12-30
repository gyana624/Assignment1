package gayna5;

//import java.util.Scanner;

class Result
	{
	int a;
	void cal(int x,int y)
	{
	System.out.println("Input First Number:\t"+x);
//	Scanner ant =new Scanner(System.in);
//	int a = ant.nextInt();
	System.out.println("Input First Number:\t"+y+"\n");
//	int b = ant.nextInt();
	System.out.println("\t"+x+"+"+y+"="+(x+y));
	System.out.println("\t"+x+"-"+y+"="+(x-y));
	System.out.println("\t"+x+"*"+y+"="+(x*y));
	System.out.println("\t"+x+"/"+y+"="+(x/y));
	System.out.println("\t"+x+" mod "+y+"="+(x%y));
	}
	
	
	}


public class calculator 
{
int a,b;
	public static void main(String[] args) 
	{
	Result a1=new Result();
	a1.cal(125,24);
	}

}
