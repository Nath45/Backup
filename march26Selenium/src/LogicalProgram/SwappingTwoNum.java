package LogicalProgram;

public class SwappingTwoNum 
{

	public static void main(String[] args) 
	{
	
		int a=10, b=20;
		
		System.out.println("Before Swapping values are..."+a+"  "+b);
		
		//Logic 1- Third value
		
//		int t=a;
//		
//		a=b;    //20
//		b=t;    //10

		//Logic 2- use + & - without using third variable
		
//		a=a+b;     //30
//		b=a-b;     //30-20=10
//		a=a-b;     //30-10=20

		//Logic 3- * + & / without using third variable
		//Here a& b values should not be equal to zero
		
//		a=a*b;      //200
//		b=a/b;      //200/20=10
//		a=a/b;      //200/10=20

		// Logic 4- Bitwise XOR (^)
		
//		a=a^b;       //30
//		b=a^b;       //10
//		a=a^b;       //20

		//Logic5- Single Statement
		
		b=a+b-(a=b);   //10+20-(20)=10
		
		
		
		System.out.println("After Swapping values are..."+a+"  "+b);

	}

}
