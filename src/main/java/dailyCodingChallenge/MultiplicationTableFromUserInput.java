package dailyCodingChallenge;

import java.util.Scanner;

public class MultiplicationTableFromUserInput {

	public static void main(String[] args) {
		int multiple,nthTerm,i;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Multiplication Number:");
		multiple =obj.nextInt();
		System.out.println("Enter Nth Term For Multiplication");
		nthTerm=obj.nextInt();
		for(i=1; i<= nthTerm; i++) {
			int output=i*multiple;
			System.out.println(i + "*" + multiple +"=" + output);
		}

	}
}
