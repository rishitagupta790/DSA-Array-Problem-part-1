package com.in.W.sixth;

import java.util.HashSet;

class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}

			set.add(num);
		}

		return false;
	}
}

public class Question {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };

		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		boolean result = containsDuplicate.containsDuplicate(nums);

		System.out.println("Result: " + result);

	}

}
