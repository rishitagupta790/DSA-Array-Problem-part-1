package com.in.wx.seventh;

class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;

		// Move all nonzero elements to the front
		for (int num : nums) {
			if (num != 0) {
				nums[nonZeroIndex] = num;
				nonZeroIndex++;
			}
		}

		// Fill the remaining elements with zeros
		while (nonZeroIndex < nums.length) {
			nums[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
	}
}

public class Question {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };

		MoveZeroes moveZeroes = new MoveZeroes();
		moveZeroes.moveZeroes(nums);

		System.out.print("Modified Array: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

}
