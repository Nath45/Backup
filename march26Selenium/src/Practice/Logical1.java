package Practice;

public class Logical1 
{
	public static void main(String []args)
	{
		int star=1;
		
		for(int i = 1; i<=5; i++)
		{
			int k=i;
			for(int j=1; j<=star; j++)
			{
				if(i % 2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(k++);
				}
				
			}
			
			System.out.println();
			star++;
		}
	}

}
