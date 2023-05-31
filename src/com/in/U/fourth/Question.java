package com.in.U.fourth;

class PlusOne {
	public int[] plusOne(int[] digits) {
		int n = digits.length;

		// Start from the rightmost digit
		for (int i = n - 1; i >= 0; i--) {
			// Increment the current digit by one
			digits[i]++;

			// If the digit becomes 10, carry over to the next digit
			if (digits[i] == 10) {
				digits[i] = 0;
			} else {
				// No carry over needed, return the incremented array
				return digits;
			}
		}

		// If all digits become 0, we need to add an additional digit
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;

		return newDigits;
	}
}

public class Question {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };

		PlusOne plusOne = new PlusOne();
		int[] result = plusOne.plusOne(digits);

		System.out.print("Result: ");
		for (int digit : result) {
			System.out.print(digit + " ");
		}

	}

}
