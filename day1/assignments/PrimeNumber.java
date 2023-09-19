package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int inputNumber = 11;
		boolean isPrimeFlag = true;
		if (inputNumber == 0 || inputNumber == 1) {
			System.out.println("The number is neither prime nor composite");

		} else {
			for (int i = 2; i < inputNumber; i++) {
				if (inputNumber % i == 0) {
					isPrimeFlag = false;
					System.out.println("The given number is not Prime");
					break;
				}
			}
			if (isPrimeFlag == true) {
				System.out.println("The given number is Prime");
			}
		}

	}

}
