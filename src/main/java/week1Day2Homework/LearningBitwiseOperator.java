package week1Day2Homework;

public class LearningBitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 12, number2 = 25, result;
		
		//Bitwise OR Operator
    	result = number1 | number2;
    	System.out.println(result);
    	
    	//Bitwise AND Operator
    	result = number1 & number2;
    	System.out.println(result);
    	
    	//Bitwise Complement Operator
    	result = ~number1;
    	System.out.println(result);

    	//Bitwise XOR Operator
    	result = number1 ^ number2;
    	System.out.println(result);
    	
    	//Signed Left Shift Operator
    	
    	System.out.println(number1 << 1);
    	System.out.println(number1 << 0);
    	System.out.println(number1 << 4);
    	
    	//Signed Right Shift Operator
    	System.out.println(number1 >> 1);
    	System.out.println(number1 >> 0);
    	System.out.println(number1 >> 8);
    	
    	// Signed right shift 
    	System.out.println(number1 >> 1);
    	
    	// Unsigned right shift
    	//The unsigned right shift operator << shifts zero into the leftmost position
    	System.out.println(number1 >>> 1);
    	
    	// Signed right shift 
    	System.out.println(number2 >> 1);
    	
    	// Unsigned right shift
    	System.out.println(number2 >>> 1);
	}

}
