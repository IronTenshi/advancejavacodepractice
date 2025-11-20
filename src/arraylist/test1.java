package arraylist;

import java.util.ArrayList;

public class test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		boolean b = list1.add(1);
		boolean c = list1.add(2);
		System.out.println(b && c);
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);
		list1.set(0 , 333);
		System.out.println(list1);
		System.out.println(list1.get(0));
	}
}
