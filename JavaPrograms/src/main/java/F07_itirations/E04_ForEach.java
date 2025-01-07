package F07_itirations;

public class E04_ForEach
{
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int sum = 0;
		for (int num : arr)
		{
			sum = num + sum;
		}
		System.out.println(sum);
	}
}
