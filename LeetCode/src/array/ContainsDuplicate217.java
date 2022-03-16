package array;

import java.util.Arrays;

import defaultpackage.Utils;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Link: https://leetcode.com/problems/contains-duplicate/
 * 
 * @author speed
 *
 */
public class ContainsDuplicate217 {

	public static void main(String[] args) {
		// Example 1
		int[] input = { 1, 2, 3, 1 };
		boolean output = true;

		Utils.checkResult(containsDuplicate(input), output);

		// Example 2
		int[] input2 = { 1, 2, 3, 4 };
		boolean output2 = false;
		Utils.checkResult(containsDuplicate(input2), output2);
		// Example 3
		int[] input3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		boolean output3 = true;
		Utils.checkResult(containsDuplicate(input3), output3);
	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}

		return false;
	}

}
