package week8;

public class ReverseStringWithoutReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Anupriya";
		System.out.println(str);
		int length = str.length();
		System.out.println(length);
	
		for (int i = length-1; i >=0; i--) {
		System.out.print(str.charAt(i));
		}

	}

}
