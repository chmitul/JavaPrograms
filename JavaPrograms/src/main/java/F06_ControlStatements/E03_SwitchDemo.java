package F06_ControlStatements;

public class E03_SwitchDemo
{
	public static void main(String[] args)
	{
		int a = 10;

		switch (a)
		{
			case 10:
				System.out.println("value is 10");
			case 20:
				System.out.println("Value is 20");
			case 30:
				System.out.println("Value is 30");
			default:
				System.out.println("Value is not in the list");
		}

	}
}
