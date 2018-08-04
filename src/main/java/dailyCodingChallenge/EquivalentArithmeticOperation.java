package dailyCodingChallenge;
import java.util.Scanner;

public class EquivalentArithmeticOperation {

	public static void main(String[] args) {
		
		/*1.Write a Java Program to get 3 user inputs 
		Two Numbers 
		One String which can be either of the below “Add”/”Subtract”/“Multiply”/”Divide”
		2. Perform the equivalent arithmetic operation.
		3. Print the result in the console.*/
		
		// TODO Auto-generated method stub

		System.out.println("Enter the First Number: ");
		Scanner value = new Scanner(System.in);
		int n1 = value.nextInt();
		System.out.println("Enter the Second Number: ");
		int n2 =value.nextInt();
		System.out.println("Enter the operation: Add,Sub,Multiply,Division");
		
		String operation=value.next();
		
		switch(operation)
		{
		case "Add":
			System.out.println("The addition of two value is "+(n1+n2));
			break;
		case "Sub":
			System.out.println("The Substraction of two value is "+(n1-n2));
			break;
		case "Multiply":
		System.out.println("The multiplication of two value is "+(n1*n2));
		break;
		case  "Division":
		System.out.println("The division of two value is "+(n1/n2));
		break;
		}

	}

}
