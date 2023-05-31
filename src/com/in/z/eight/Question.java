package com.in.z.eight;

import java.util.HashSet;

class FindErrorNums {
	public int[] findErrorNums(int[] nums) {
		int[] result = new int[2];
		HashSet<Integer> set = new HashSet<>();
		int n = nums.length;
		int sum = (n * (n + 1)) / 2; // Expected sum of numbers from 1 to n
		int actualSum = 0; // Actual sum of elements in nums

		for (int num : nums) {
			actualSum += num;
			if (set.contains(num)) {
				result[0] = num; // Duplicate number
			}
			set.add(num);
		}

		result[1] = sum - (actualSum - result[0]); // Missing number

		return result;
	}
}

public class Question {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };

		FindErrorNums findErrorNums = new FindErrorNums();
		int[] result = findErrorNums.findErrorNums(nums);

		System.out.println("Duplicate Number: " + result[0]);
		System.out.println("Missing Number: " + result[1]);
	}

}
