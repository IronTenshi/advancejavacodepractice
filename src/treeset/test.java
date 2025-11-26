package treeset;

import java.util.TreeSet;
import java.util.function.Consumer;

public class test {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(2);
		System.out.println(treeSet);
		//treeSet.forEach(t -> System.out.println(t));
		treeSet.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			};
		});
	}
}
