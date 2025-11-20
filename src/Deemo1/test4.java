package Deemo1;

import java.util.Scanner;

public class test4 {
	public static boolean judgement(String s1, String s2)
	{
		for (int i = 0; i < s1.length() ; ++i)
		{
			String end = s1.substring(1);
			char first = s1.charAt(0);
			String temp = end + first;
			if (temp.equals(s2))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input the first strings");
		String s1 = new String(scanner.next());
		System.out.println("please input the second strings");
		String s2 = new String(scanner.next());
		scanner.close();
		
		System.out.println(judgement(s1, s2));
	}
}