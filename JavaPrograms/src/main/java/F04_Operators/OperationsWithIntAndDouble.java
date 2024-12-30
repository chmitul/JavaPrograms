package F04_Operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntAndDouble
{
	public static void main(String[] args)
	{
		int fee = 20;
		int numberOfPeople = 3;

		System.out.println(" ");
		System.out.println(fee / numberOfPeople);
		System.out.println((double) fee / numberOfPeople);

		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		BigDecimal passengers = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(passengers, RoundingMode.HALF_UP);

		System.out.println("Charge per person is " + chargePerPerson);

	}

}
