package F06_ControlStatements;

public class E02_CodingExcercise
{
	public static void main(String[] args)
	{
		String adminFlag = "--Admin";
		String guestFlag = "--Guest";

		String inputArgument = String.join(",", args);
		if ((inputArgument.equals(adminFlag)) || (inputArgument.equals(guestFlag)))
		{
			System.out.println("Input argument cannot start with --");
		}
		else if (inputArgument.equals("Admin"))
		{
			System.out.println("Welcome Admin");
		}
		else if (inputArgument.equals("Guest"))
		{
			System.out.println("Welcome Guest");
		}

	}

}
