package dailyCodingChallenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p;
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the value of n for prime number=");
		n=scr.nextInt();
		for(int i=2;i<n;i++) {
			p=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}

}
