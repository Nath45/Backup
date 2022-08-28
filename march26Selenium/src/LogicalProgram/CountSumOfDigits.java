package LogicalProgram;

public class CountSumOfDigits {

	public static void main(String[] args) 
	{
		int num=89734;
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;   //4
			num=num/10;      //123
		}
		
		System.out.println(sum);

	}

}
