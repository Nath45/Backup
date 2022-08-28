package LogicalProgram;

public class Ex1 {

	public static void main(String[] args) 
	{
		String org="Madam";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("Original String: "+org);
		System.out.println("Reverse String: "+rev);
		
		if(org.equals(rev))
		{
			System.out.println("Given num is Palindrome num");
		}
		else
		{
			System.out.println("Given num is not Palindrome num");
		}

	}

}
