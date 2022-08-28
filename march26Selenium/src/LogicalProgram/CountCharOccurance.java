package LogicalProgram;

public class CountCharOccurance {

	public static void main(String[] args) 
	{
		String s="Java Programming Java oops";
		int Tcount=s.length();      //total length
		
		int TcountAfterRemovea=s.replace("o", "").length();
		
		int count=Tcount-TcountAfterRemovea;
		
		System.out.println("Number of occurances of o is:" +count);
				

	}

}
