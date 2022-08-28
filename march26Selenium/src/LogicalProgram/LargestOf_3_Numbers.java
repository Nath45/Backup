package LogicalProgram;

import java.util.Scanner;

public class LargestOf_3_Numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Num: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Num: ");
		int b=sc.nextInt();

		System.out.println("Enter Third Num: ");
		int c=sc.nextInt();
		
		//Approach1- Logic
		
	/*	if(a>b && a>c)
		{
			System.out.println(a+ " is Largest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ " is Largest Number");
		}
		else
		{
			System.out.println(c+ " is Largest Number");
		}*/

		
		//Approach2- Ternary Operator
		
//		int largest1=a>b?a:b;
//		int largest2=c>largest1?c:largest1;
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest+ " is largest number");
		

	}

}
