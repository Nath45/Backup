package Practice;

import java.util.Scanner;

public class armStrongNum 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int temp=number;
	int rem=0;
	int sum=0;
	
	while(number>0)
	{
		rem=number%10;
		sum=sum+(rem*rem*rem);
		number=number/10;
	}
	
	if(temp==sum)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
	
	}
	
}