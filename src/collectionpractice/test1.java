package collectionpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class test1 {
//	static Collection<Integer> arraylistCollection = new ArrayList<Integer>();
	static List<Integer> arraylistCollection = new ArrayList<Integer>();

	static {
		arraylistCollection.add(3);
		arraylistCollection.add(4);
		arraylistCollection.add(5);
		arraylistCollection.add(6);
	}
	public static void main(String[] args) {
//		Iterator<Integer> it = arraylistCollection.iterator();
//		while(it.hasNext()) {
//			int num = it.next();
//			System.out.println(num);
//		}
//		arraylistCollection.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			};
//		});
//		arraylistCollection.forEach(t -> System.out.println(t));
//		ListIterator<Integer> listIterator = arraylistCollection.listIterator();
//		while (listIterator.hasNext()) {
//			int num = listIterator.next();
//			if (num == 3)
//				listIterator.add(100);
//		}
//		System.out.println(arraylistCollection);
//		Iterator<Integer> iterator = arraylistCollection.iterator();
//		while (iterator.hasNext()) {
//			int num = iterator.next();
//			if (num == 3)
//				iterator.remove();
//		}
//		System.out.println(arraylistCollection);
	}
}
