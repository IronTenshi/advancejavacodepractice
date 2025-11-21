package arraylist;

import java.util.ArrayList;

public class test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("genshin");
		list.add("ccb");
		list.add("nmsl");
		list.add("2b");
		for(String list1 : list)
		{
			System.out.println(list1);
		}
		for(int i = 0; i < list.size() ; ++i)
		{
			System.out.println(list.get(i));
		}
	}
}
