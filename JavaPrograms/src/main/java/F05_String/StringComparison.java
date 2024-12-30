package F05_String;



public class StringComparison
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = " HELLO " ;

		System.out.println(s1 == s2);
		System.out.println(s1 == new String("HELLO"));
		System.out.println(s1 != s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.trim().equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s1.intern());
	}
}
