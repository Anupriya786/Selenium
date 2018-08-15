package week8;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
	
	Map<String, Integer> bags = new LinkedHashMap<String, Integer>();
	bags.put("american", 600);
	bags.put("vip", 1000);
	bags.put("skybag", 600);
	bags.put("vip", 800);
	/*Set<String> allKeys = bags.keySet();
	for (String eachKey : allKeys) {
	System.out.println(eachKey+"-->"+bags.get(eachKey));
	}*/
	for (Entry<String, Integer> eachBag : bags.entrySet()) {
		System.out.println(eachBag.getKey()+"-->"+eachBag.getValue());
	}
	
	}

}

