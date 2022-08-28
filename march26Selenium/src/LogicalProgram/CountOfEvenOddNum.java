package LogicalProgram;

public class CountOfEvenOddNum 
{

	public static void main(String[] args) 
	{
		int num=23476894;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;     //4
		
		
		if(rem%2==0)
		{
			even_count++;
		}
		
		else
		{
			odd_count++;
		}
		
		num=num/10;
		
	}
	
	System.out.println("Count of number of even digits: "+even_count);
	
	System.out.println("Count of number of odd digits: "+odd_count);

	}
}
