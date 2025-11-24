package interfacepractice;

import java.util.List;
import java.util.ArrayList;

public class test {
	static List<Frog> frogs = new ArrayList<Frog>();
	static
	{
		frogs.add(new Frog("qwe", 12));
		frogs.add(new Frog("qwec", 123));
		frogs.add(new Frog("qwer", 13));
	}
	public static void main(String[] args) {
		for (Frog frog : frogs)
		{
			frog.display();
			frog.action();
			frog.swim();
		}
		System.out.println(Swim.sbString);
	}
}
