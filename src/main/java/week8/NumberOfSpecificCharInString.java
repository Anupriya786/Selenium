package week8;

import static org.testng.Assert.assertEquals;

public class NumberOfSpecificCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= "Anupriya";
		String str="anupriya";
		System.out.println("Name = " + str);
		char somechar= 'a';
		//char[] ch=str.toCharArray();
		int count=0;
//		for(char each : ch) {
//		//System.out.println(each);	
//		if(each=='a' || each== 'A') {
//		 count=count+1;
//		}	
//		}
//		System.out.println("Number Of Character 'a' in Name =  " + count);
//	
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==somechar) {
				count++;
			}
		}
		System.out.println("Number Of Character 'a' in Name ="+ count);
	}
	
	
}

