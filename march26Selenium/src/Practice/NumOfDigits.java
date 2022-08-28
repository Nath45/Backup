package Practice;

public class NumOfDigits {

	public static void main(String[] args) {

		int Num=123345659;
		
		int count=0;
		
		while(Num>0)
		{
			Num=Num/10;
			count++;
		}
		
		System.out.println("Number of digits:" + count);
		
		String num="123345659";
		System.out.println("No of digits:" +num.length());

	}
	
	
	
	

}
