package F04_Operators;

public class RandomNumberGeneration
{
	public static void main(String[] args)
	{
		double num1 = Math.random();
		double num2 = Math.random() * 100;
		double num3 = (Math.random() * 100) + 10000;

		System.out.println((int) num1); // will always return zero.
		System.out.println((int) num2);
		System.out.println((int) num3);
	}

}
