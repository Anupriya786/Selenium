package week8;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnCollections {

	public static void main(String[] args) {
	
	List<String> bagName = new LinkedList<String>();
	Set<String> bagSet = new TreeSet<String>();
	bagName.add("American");
	bagName.add("Reebook");
	bagName.add("Puma");
	bagName.add("skybag");
	bagName.add("American");
	bagName.add("vip");
	bagName.add("wildcraft");
	bagSet.addAll(bagName);
	Collections.sort(bagName);
	for (String eachBagName : bagSet) {
		System.out.println(eachBagName);	
	}
}

}
