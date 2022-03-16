package array;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * @author speed
 *
 */
public class TwoSum1 {

	public static void main(String[] args) {
/*
		// Example 1
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] output = { 0, 1 };

		// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

		checkResult(twoSum(nums, target), output);

		// Example2
		int[] nums2 = { 3, 2, 4 };
		target = 6;
		int[] output2 = { 1, 2 };
		checkResult(twoSum(nums2, target), output2);
		
		
		int[] nums3  = {3,3};
		 target = 6;
		 int[] output3 = {0,1};
		 checkResult(twoSum(nums3, target), output3);
		 
		 */
		 int[] nums4 = {-3,4,3,90};
		 int target = 0;
		 int[] output4 = {0,2};
		 checkResult(twoSum(nums4, target), output4);
	}

	private static int[] twoSum(int[] nums, int target) {

		// do it as an array
		for (int i = 0; i < nums.length; i++) {
			int left = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int right = nums[j];
				if (left + right == target) {
					return new int[] { i, j };
				}

			}
		}
		

		return new int[2];
	}

	private static void checkResult(int[] nums, int[] output) {
		System.out.println("Calculated Result: " + Arrays.toString(nums));
		System.out.println("Expected output: " + Arrays.toString(output));
		System.out.println(Arrays.equals(nums, output) ? "Result is correct" : "Result is NOT correct");
	}

}
