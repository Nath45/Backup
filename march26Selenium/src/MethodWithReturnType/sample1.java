package MethodWithReturnType;

public class sample1 
{
	public static void main(String[] args) 
	{

		int num3=addition(15,25);
		int num4=addition(7,5);

		System.out.println(num3*num4);

		System.out.println("-------");

		System.out.println(addition(100,200));
	}

	public static int addition(int num1, int num2)
	{

		int add=num1+num2;
		return add;


	}





}
