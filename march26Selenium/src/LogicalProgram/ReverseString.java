package LogicalProgram;

public class ReverseString 
{
	public static void main(String[] args) 
	{
	      //1) Using + (String concatenation) Operator 
		
		String str="RAMAYAN";
		String rev= "";
		
//		int len=str.length();           //1. find length of string
//	    
//		for(int i=len-1; i>=0; i--)
//		{
//			
//			rev=rev+str.charAt(i);
//			
//		}
		
		
		//2) Using character array
		
		
//		char a[]=str.toCharArray();
//		
//		int len=str.length();
//		
//		for(int i=len-1; i>=0; i--)
//		{
//			
//			rev=rev+a[i];
//			
//		}
		
//		System.out.println("Reverse string is:"+rev);

		
		//3) Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

	
	
	
	
	
	
}
