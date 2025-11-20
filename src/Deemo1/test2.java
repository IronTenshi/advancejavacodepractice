package Deemo1;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		String scString = new String();
		Scanner scanner = new Scanner(System.in);
		scString = scanner.next();
		
		StringBuilder sb = new StringBuilder(scString);
		String scString2 = sb.reverse().toString();
		
		if (scString2.equals(scString))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		scanner.close();
	}
}
