package F05_String;

public class E01_Demo
{
	public static void main(String[] args)
	{

		System.out.println(" ");
		System.out.println("String Methods");
		System.out.println("******************** ");

		String str = "Hello ";

		System.out.println("Length  :" + str.length());
		System.out.println("Str contains He in it :" + str.contains("He"));
		System.out.println("String in Lower case  :" + str.toLowerCase());
		System.out.println("String in upper case  :" + str.toUpperCase());
		System.out.println("is String empty  :" + str.isEmpty());
		System.out.println("is string blank  :" + str.isBlank());
		System.out.println("str starts with H  :" + str.startsWith("h"));
		System.out.println("Replace ll with LL  :" + str.replace("ll", "LL"));
		System.out.println("Trim the spaces in string  :" + str.trim());
		System.out.println("Substring the string from and to :" + str.substring(0, 3));
		System.out.println("Substring the string position : " + str.substring(3));
		System.out.println("Char at a position " + str.charAt(3));
	}

}
