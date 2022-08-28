package MethodWithReturnType;

public class ParametersEx1 
{
	public static void main(String[] args) 
	{

		System.out.println("** Program Starts**");
		ParametersEx1 obj=new ParametersEx1();
		obj.test1(99, 'q', 50);
		obj.test2(false,99.44f);

		System.out.println("** Program ends**");

	}

	public float test1(double d, char ch, int i)
	{
		System.out.println("d= "+d);
		System.out.println("ch= "+ch);
		System.out.println("i= "+i );
        float sub= (float) (d-i);
		return sub;
	}

	public void test2(boolean flag, float f)

	{
		System.out.println("flag= "+flag);
		System.out.println("float f= "+f);



	}

}
