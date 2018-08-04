package week1Day1HomeWork;

import java.util.Scanner;

public class CheckOddEvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckOddEvenPrime chck = new CheckOddEvenPrime();
	//	chck.OddEven();
		chck.Prime();
	}

//	int number = 923;
//
//	public void OddEven() {
//
//		if (number / 2 == 0) {
//			System.out.println("Number is Even");
//		} else {
//			System.out.println("Number is Odd");
//		}
//
//	}
	int number;
	public void Prime() {
		Scanner numobj=new Scanner(System.in);
		number=numobj.nextInt();
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

}
