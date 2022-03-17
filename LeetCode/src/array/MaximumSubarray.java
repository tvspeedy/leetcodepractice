package array;

import defaultpackage.Utils;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * @author speed
 *
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		// Example 1
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int output = 6;
		// Explanation: [4, -1, 2, 1] has the largest sum = 6
		
		Utils.checkResult(maxSubArray(nums), output);
		
		// Example 2
		int[] nums2 = { 1 };
		int output2 = 1;

		Utils.checkResult(maxSubArray(nums2), output2);
		
		// Example3
		int[] nums3 = { 5, 4, -1, 7, 8 };
		int output3 = 23;
		Utils.checkResult(maxSubArray(nums3), output3);
		
		int[] nums4 = {-2,-1};
		int output4 = -1;
		Utils.checkResult(maxSubArray(nums4), output4);
	}

	public static int maxSubArray(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		int rollingMax = 0;
		int totalMax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			rollingMax += nums[i];

			if (rollingMax > totalMax) {
				totalMax = rollingMax;
			}
			if (rollingMax < 0) {
				rollingMax = 0;
			}

		}

		return totalMax;
	}

}
