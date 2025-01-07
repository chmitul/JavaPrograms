package F07_itirations;

public class E05_JumpStatements
{
	public static void main(String[] args)
	{
		System.out.println("Odd Numbers");
		for (int i = 1; i < 25; i++)
		{
			if (i % 2 == 0)
			{
				continue;
			}
			System.out.println(i);
		}

		for (int i = 1; i < 10; i++)
		{
			if (i - 5 == 0)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
