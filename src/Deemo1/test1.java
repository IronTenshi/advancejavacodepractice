package Deemo1;

public class test1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("sd");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		String sbString = sb.toString();
		System.out.println(sbString.charAt(0));
	}
}
