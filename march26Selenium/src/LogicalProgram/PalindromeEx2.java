package LogicalProgram;

public class PalindromeEx2 
{
	public static void main(String[] args) 
	{
		//String org="abcd";
		String org="madam";
		String rev="";
		
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Original String: "+org);
		
		System.out.println("Reverse String: "+rev);
		
		if(org.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	
	}

}
