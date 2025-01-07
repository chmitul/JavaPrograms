package F07_itirations;

public class E02_DoWhile
{
	public static void main(String[] args)
	{
		int i = 10;

		do
		{
			System.out.println(i);
			i++;
		} while (i < 10);
	}
}

// Here even though the condition fails, still the  value is printed at least once.