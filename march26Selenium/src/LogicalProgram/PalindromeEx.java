package LogicalProgram;

public class PalindromeEx {

	public static void main(String[] args) {
		
		int org_num=343;
		int num=org_num;
		
		int rev=0;
		
		while(num!=0)
		{
		    rev=rev*10 + num%10;
			
			num=num/10;
		}
		
		if(org_num==rev)
		{
			System.out.println(rev + ": is palindrome");
		}
		else
		{
			System.out.println(rev+": is not palindrome");
		}

	}

}
