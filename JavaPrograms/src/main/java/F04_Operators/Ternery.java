package F04_Operators;

// DataType  variable = (Condition ? What is TRUE : What if FALSE)


public class Ternery
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		String msg = (a > b ? "Value a is greater than b" : "Value B is greater than A");
		System.out.println(msg);
	}

}
