package dailyCodingChallenge;
import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfArray[]= new int[3];
		int smallest=0,secondSmallest=0;
		System.out.println("Enter First Number:");
		Scanner obj=new Scanner(System.in);
		numberOfArray[0]=obj.nextInt();
		System.out.println("Enter Second Number:");
		numberOfArray[1]=obj.nextInt();
		System.out.println("Enter Third Number:");
		numberOfArray[2]=obj.nextInt();
		for(int i=0;i<=2;i++) {
			if(numberOfArray[i]>smallest) {
				secondSmallest=smallest;
				smallest=numberOfArray[i];
			}
			else if(secondSmallest<numberOfArray[i]){
				secondSmallest=numberOfArray[i];
			}
			
		}
		System.out.println("Second Smallest Number is = " + secondSmallest);
		
	}

}
