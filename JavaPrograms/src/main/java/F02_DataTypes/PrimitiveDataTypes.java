package F02_DataTypes;

/*
 * Integers, Floating,characters,Booleans*
 * Primitive store the actual value of the variable but the reference store the address of the value.
 * Integers - byte, short,int, long
 * Float - float, double
 * Boolean - boolean
 * Characters - char
 *
 * the primitive type having the higher value, can store the value of lower value primitive type, but it cannot be vice versa.
 * but the above can be achieved by casting the value to.
 *
 */

import java.util.function.DoubleToIntFunction;

public class PrimitiveDataTypes
{
	public static void main(String[] args)
	{
		byte b = 10;
		short s = 100;
		int i = 1000;
		long l = 10000L;

		float f = 23.25F;
		double d = 254874.1254D;

		char ch = 'S';
		boolean boo = true;

		char ch1 = 125 ;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(boo);
		System.out.println(ch);
		System.out.println(ch1);
	}

}
