package Deemo1;

import java.util.StringJoiner;

public class test3 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("---");
		sj.add("aaa").add("bbb");
		String scString = sj.toString();
		System.out.println(scString);
		System.out.println(sj.length());
	}
}
