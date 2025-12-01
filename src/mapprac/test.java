package mapprac;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("As", "dingge666");
		map.put("bd", "sdsd");
		map.put("inter", "return");
//		String valueString = map.put("As", null);
//		System.out.println(valueString);
		//map.remove("As");
		map.clear();
		boolean b = map.isEmpty();
		System.out.println(b);
		System.out.println(map);
	}
}
