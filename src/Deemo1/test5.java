package Deemo1;

import java.util.Scanner;
import java.util.StringJoiner;

public class test5 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		String str = sb.append(scanner.next()).toString();
		System.out.println(sb.capacity());
		System.out.println(str.length());
		scanner.close();
		
		StringJoiner sj = new StringJoiner("---","[","]");
		sj.add(str);
		sj.add(str);
		sj.add(str);
		sj.add(sb);
		
		String str2 = sj.toString();
		System.out.println(str2);
	}
}
