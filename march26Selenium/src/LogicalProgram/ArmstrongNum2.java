package LogicalProgram;

public class ArmstrongNum2 {

	public static void main(String[] args) 
	{
		int remainder, number, sum=0;
		
		System.out.println("Armstrong number is=");
		
		for(int i=1; i<=1000;i++)
		{
			number=i;
			
			while(number>0)
			{
				remainder=number%10;
				
				number=number/10;
				
				sum=sum+(remainder*remainder*remainder);
			}
			
			if(i==sum)
			{
				System.out.println(i);
			}
			sum=0;
		}

	}

}
