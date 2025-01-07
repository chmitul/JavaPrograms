package F06_ControlStatements;

import java.util.Scanner;

public class E04_CodingExercise
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		switch (input)
		{
			case "login":
				System.out.println("Enter username");
				break;
			case "signup":
				System.out.println("Welcome");
				break;
			case "terminate":
				System.out.println("Thank you, Visit again");
				break;
			default:
				System.out.println("Please enter one of the given values");
		}

	}
}
