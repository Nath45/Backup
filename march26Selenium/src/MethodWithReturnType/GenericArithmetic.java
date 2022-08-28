package MethodWithReturnType;

public class GenericArithmetic 
{
	
	public int addition(int a, int b)
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int sum=a+b;
		return sum;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("**Program Starts**");
	
		GenericArithmetic obj=new GenericArithmetic();
		System.out.println(obj.addition(700, 500));
		System.out.println(obj.subtraction(900,200));
		int sum=obj.addition(400, 800);
		System.out.println(obj.subtraction(sum, 500));
		System.out.println("**Program Ends**");
		
	}
	
	public int subtraction(int x, int y)
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		int sub=x-y;
		return sub;
		
	}
	
	
}
