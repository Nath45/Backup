package LogicalProgram;

public class ReverseEachWordInString 
{
	public static void main(String[] args) 
	{
		// Approach 1
		
		String str="Welcome To Java";     // Original string
		String[] words=str.split(" ");    // Splitting string into multiple words
		String reverseString="";
		
		for(String w:words)
		{
			String reverseword="";
			
			for(int i=w.length()-1; i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);
		
	}

}
