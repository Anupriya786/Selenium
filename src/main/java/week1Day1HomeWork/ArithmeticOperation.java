package week1Day1HomeWork;

class ArithmeticOperation {

	int number1 = 28;
	int number2 = 25;

	public void Addition() {
		System.out.println(number1 + number2);

	}
	public void Substraction() {
		System.out.println(number1 - number2);

	}

	public int Multiply() {
		System.out.println(number1*number2);
		return 0;
	}

	public void multiplyNumberOneByNumberTwo() {
		System.out.println(number1 * 2);

	}

	public int divideNumberTwoByTen(int Dividend) {
		int quotient = number2 / Dividend;
		return quotient;

	}

}
