package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Price {

	public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(999);
	list.add(666);
	list.add(999);
	list.add(999);
	Set<Integer> set = new HashSet<Integer>();
	set.addAll(list);
	int max =0;
	int count =0;
	for (int eachSet : set) {
		count =0;
		for (int eachList : list) {
			if (eachSet==eachList) {
				count++;
			}
		}
		if ( count>=max) {
			max=count;
		}
	}
	System.out.println(max);
	}
}
