package F03_Arrays;

import java.util.Arrays;

public class ArrayExample
{
	public static void main(String[] args)
	{
		int[] arr;
		int arr2[];

		arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		System.out.println(arr[0]);

		double[] doubarray = new double[5];
		doubarray[0] = 1.0D;
		doubarray[1] = 125.10D;
		doubarray[2] = 136454.458D;
		doubarray[3] = 14514.251D;

		System.out.println(doubarray[3]);

		System.out.println(Arrays.toString(doubarray));
	}

}
