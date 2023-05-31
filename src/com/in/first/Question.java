package com.in.first;

import java.util.HashMap;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two numbers add up to the target.");
	}
}

public class Question {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		TwoSum twoSum = new TwoSum();
		int[] indices = twoSum.twoSum(nums, target);

		System.out.println("Indices: " + indices[0] + ", " + indices[1]);

	}

}
