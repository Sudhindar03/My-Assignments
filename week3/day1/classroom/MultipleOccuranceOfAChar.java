package week3.day1.classroom;

public class MultipleOccuranceOfAChar {

	public static void main(String[] args) {

		String input = "TestLeaf";

		int count = 0;

		char[] inputArray = input.toCharArray();

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);
	}
}
