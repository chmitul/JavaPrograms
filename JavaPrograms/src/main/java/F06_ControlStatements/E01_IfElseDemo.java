package F06_ControlStatements;

public class E01_IfElseDemo
{
	public static void main(String[] args)
	{
		int bankBalance = 100;
		int productPrice = 200;

		if (bankBalance < productPrice)

		{
			System.out.println("You donot have sufficient balance in the account, please check");
		}

		else
		{
			System.out.println("You can purchase the product");
		}

		bankBalance += 200;
		if (bankBalance < productPrice)

		{
			System.out.println("You donot have sufficient balance in the account, please check");
		}

		else
		{
			System.out.println("You can purchase the product");
		}

	}

}
