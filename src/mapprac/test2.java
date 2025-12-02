package mapprac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class test2 {
	public static void main(String[] args) {
		Map<String, String> hashtable = new HashMap<String, String>();
		hashtable.put("aaaa", "1111");
		hashtable.put("bbbb", "2222");
		hashtable.put("cccc", "3333");
//		System.out.println(hashtable.get("bbbb"));
//		Set<String> keySet = hashtable.keySet();
//		for (String key : keySet) {
//			String valueString = hashtable.get(key);
//			System.out.println(valueString);	
//		}
//		Iterator<String> iterator = keySet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(hashtable.get(iterator.next()));
//		}
//		keySet.forEach(t -> System.out.println(hashtable.get(t)));
//		keySet.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(hashtable.get(t));
//			};
//		});
		
		
		Set<Map.Entry<String, String>> set = hashtable.entrySet();
		for (Entry<String, String> sEntry : set) {
			System.out.println(sEntry);
		}
	}
}
