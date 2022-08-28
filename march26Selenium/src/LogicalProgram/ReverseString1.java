package LogicalProgram;

public class ReverseString1 {

	public static void main(String[] args) 
	{
		String org="abcd";
		String rev="";
		
		
		for(int i=org.length()-1; i>=0;i--)
		{
			rev=rev+org.charAt(i);
			
		}
		
		System.out.println("Original String: "+org);
		System.out.println("Reverse String: "+rev);

	}

}
