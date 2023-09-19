package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 10;
		int firstNumber = 0;
		int secondNumber = 1;

		System.out.println(firstNumber); // printing firstNumber = 0
		System.out.println(secondNumber);// printing secondNumber = 1

		for (int i = 1; i <= range; i++) {
			int sum = firstNumber + secondNumber; // sum = 0 + 1 = 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
			firstNumber = secondNumber; // firstNumber = 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
			secondNumber = sum; // secondNumber = 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
			System.out.println(sum); // sum = 1,2,3,5,8,13,21,34,55,89
		}
	}

}
