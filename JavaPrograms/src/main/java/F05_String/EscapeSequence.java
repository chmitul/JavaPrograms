package F05_String;

/*
 * \t tab
 * \b  backspace
 * \r  enter / carriage return
 * \f  form feed
 * \'  single quote
 * \" double quote
 * \\   backslash
 * \n   new line
 *
 * */

public class EscapeSequence
{
	public static void main(String[] args)
	{

		System.out.println("I am in IBMi \"programmer\" ");
		System.out.println("The path is \"\\c\\microsoft\\programs\"");
		System.out.println("line 1 \nline 2");
		System.out.println("Copy right character \u00A9");
		System.out.println("here goes the tab \t , yes tab");
	}
}
