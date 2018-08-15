package week8;

public class ChangeEverySecondCharacterIntoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "amazon";
		//System.out.println(cahr.text.charAt(0)-32));
		
		for (int i = 0, len = text.length(); i < len; i++) {
		    char ch = text.charAt(i);
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
		System.out.println();
	}

}
