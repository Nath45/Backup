package StarPatternEx1;

public class Ex5 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)         // for spaces
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)         // for printing stars
			{
			System.out.print("*");
			}
			
			System.out.println();
		
		}

	}



}
