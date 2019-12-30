package gyana8;

class Peri_Area
	{
	void cal(double r)
	{
		
//		float pi=22/7;
		System.out.println("Radius="+r);
		System.out.println("Perimeter is="+(2*Math.PI*r));
		System.out.println("Perimeter is="+(Math.PI*r*r));
		
	}
	
	}


public class Circle 
{
	
	public static void main(String[] args) 
	{
		Peri_Area dad=new Peri_Area();
		dad.cal(7.5);

	}

}
