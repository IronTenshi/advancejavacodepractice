package Static;

import java.util.StringJoiner;

public class Arrayutil {
	private Arrayutil() {};
	
	public static String printString(int[] arr)
	{
		StringJoiner sj = new StringJoiner(",","[","]");
		for (int i = 0 ; i < arr.length; ++i)
		{
			sj.add(String.valueOf(arr[i]));
		}
		return sj.toString();
	}
	
	public static int getAverage(int[] arr)
	{
		int average = 0;
		for (int num : arr)
		{
			average += num;
		}
		return average / arr.length;
	}
}
