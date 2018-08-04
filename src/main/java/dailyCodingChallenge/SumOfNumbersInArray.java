package dailyCodingChallenge;

import java.util.Scanner;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number of Elements in the Array:");
		int number= scr.nextInt();
		int[] numberArray = new int[number];
		System.out.println("Enter the numbers in the Array:");
		for(int i=0;i<number;i++) {
			numberArray[i]=scr.nextInt();
			sum = sum + numberArray[i];
		}
		System.out.println("Sum Of Given Numbers In The Array = " + sum);
	}

}
