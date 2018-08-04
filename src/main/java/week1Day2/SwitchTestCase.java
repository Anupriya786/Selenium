package week1Day2;
import java.util.Scanner;

public class SwitchTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose the TestCase Result From the Given List : \n Pass \n Fail \n Blocked \n Invalid");
		System.out.println("Enter your results the same as the above given choices: ");
		Scanner sw = new Scanner(System.in);
		String user=sw.nextLine();
		
		switch(user)
		{
		case "Pass" :
			System.out.println("Test Case is Passed");
			break;
		case "Fail" :
			System.out.println("Test Case is Passed");
			break;
		case "Blocked" :
			System.out.println("Test Case is Passed");
			break;
		default :
			System.out.println("Test Case is Invalid");
			break;
			
		
		}
	}

}
