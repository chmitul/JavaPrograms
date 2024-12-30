package F04_Operators;

// unary operators are +,-,++,--
// Operation is performed on a single variable.

public class Unary
{
	public static void main(String[] args)
	{
		int i1 = +10;  // here the + prefix is not required.
		int i2 = -10;  // here the value will be treated as -11
		int i3 = ++i1;// 11
		int i4 = i1++;//11
		int i5 = i1--;// 12
		int i6 = --i1;//10

		System.out.println(i3 + " " + i4 + " " + i5 + " " + i6);

	}
}
