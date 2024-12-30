package F02_DataTypes;

/*
 * decimal is straight away normal number
 * octal Number is prefixed by Zero
 * Hex decimal value is assigned by using prefix as 0X
 * binary value is assigned using the 0b as prefix.
 *
 * */

public class NumberSystems
{
	public static void main(String[] args)
	{

		int dec = 1433;
		int oct = 02541;
		int hex = 0x658ACE;
		int bin = 0b1001010;

		System.out.println("Decimal value of : " + dec);
		System.out.println("Octal value : " + oct);
		System.out.println("Hexa value : " + hex);
		System.out.println("Binary value : " + bin);
	}

}
