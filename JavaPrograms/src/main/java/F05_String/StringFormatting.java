package F05_String;

public class StringFormatting
{
	public static void main(String[] args)
	{
		String name = "Mithul";
		String greeting = "Afternoon";
		String message = "Hello %s, Good %s !!";

		String formattedString = String.format(message, name, greeting);
		System.out.println(formattedString);

		System.out.printf("Mithul was born in the year %d", 1986);


	}

}
