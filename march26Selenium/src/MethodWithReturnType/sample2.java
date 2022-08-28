package MethodWithReturnType;

public class sample2 
{

	// method with string return type
	
	public static String convertStringToUpperCase(String name)
	{
		
		String s1=name.toUpperCase();
		
		return s1;
	}
	
	public static void main(String[] args) 
	{
	
		String s2=convertStringToUpperCase("abc");
		System.out.println(s2);
		System.out.println("-------");
		
		int num=sample3.printLengthOfString("abc");
		System.out.println(num);
		
		System.out.println(sample3.printLengthOfString("abcd"));
		
	}
	
	
	
	
}
