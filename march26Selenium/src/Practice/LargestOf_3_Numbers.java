package Practice;

import java.util.Scanner;

public class LargestOf_3_Numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int b=sc.nextInt();

		System.out.println("Enter Third number: ");
		int c=sc.nextInt();
		
		
//		if (a>b && a>c)
//		{
//			System.out.println(a+" is the largest number");
//		}
//		else if (b>a && b>c)
//		{
//			System.out.println(b+" is the largest number");
//		}
//		else
//		{
//			System.out.println(c+" is the largest number");
//		}
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest+" is the largest number");
			
	}

}
