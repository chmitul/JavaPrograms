package F07_itirations;

import java.util.Scanner;

public class E06_CodingExercise1
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number of 3 length");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		for (char digitSequence : number.toCharArray())
		{
			System.out.println(digitSequence);
		}

	}
}

// Write a program which will take input a number and it should print every single number of it by breaking it.