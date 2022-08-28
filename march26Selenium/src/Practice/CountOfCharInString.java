package Practice;

public class CountOfCharInString {

	public static void main(String[] args)
	{
		String s=("Well began is half done");
		
		int Tcount=s.length();
		
		int TcountAfterRemovea=s.replace("l", "").length();
		
		int count=Tcount-TcountAfterRemovea;
		
		System.out.println("Number of occurance of l:"+count );
	}

}
