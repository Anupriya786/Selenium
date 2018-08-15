package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listbagPrice =new ArrayList<Integer>();
		listbagPrice.add(999);
		listbagPrice.add(666);
		listbagPrice.add(545);
		listbagPrice.add(545);
		listbagPrice.add(545);
		listbagPrice.add(654);
		listbagPrice.add(666);
		listbagPrice.add(999);
		listbagPrice.add(666);
		
		//To Get Maximum Price
		Collections.sort(listbagPrice);
		int sizecount=listbagPrice.size();
		System.out.println("Size Of BagPrice is " + sizecount);
		System.out.println("Maximum Price Of Bag is " + listbagPrice.get(sizecount-1));
		
		//List Change to Set
		
		Set<Integer> setbagPrice =new HashSet<Integer>();
		setbagPrice.addAll(listbagPrice);
		System.out.println("Change List To set " + setbagPrice);
	
		//Max Repeated Highest Price
		
		int max=0;
		for(int eachSet : setbagPrice) {
			int count=0;
			for(int eachList : listbagPrice) {
				if(eachSet == eachList) {
					count++;
				}
				
			}
			if(count>=max) {
				max=count; 
			}
			
		}
		System.out.println(max);
			
	}
}	
