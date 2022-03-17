package array;

import defaultpackage.Utils;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the
 * array that has the largest product, and return the product.
 * 
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * @author speed
 *
 */
public class MaxProductSubarray152 {
	public static void main(String[] args) {
		// Example 1
		int[] nums = { 2, 3, -2, 4 };
		int output = 6;
		// Explanation: [2,3] has the largest product 6
		// Utils.checkResult(maxProduct(nums), output);

		// Example 2
		int[] nums2 = { -2, 0, -1 };
		int output2 = 0;
		Utils.checkResult(maxProduct(nums2), output2);

		// Wrong answer
		int[] nums3 = { -3, -1, -1 };
		int output3 = 3;
		Utils.checkResult(maxProduct(nums3), output3);

		// Wrong answer2
		int[] nums4 = { 0, 2 };
		int output4 = 2;
		Utils.checkResult(maxProduct(nums4), output4);
	}

	public static int maxProduct(int[] nums) {

		if (nums.length == 1) {
			return nums[0] == 0 ? 0 : nums[0];
		}

		int max = nums[0];
		int min = nums[0];
		int ans = nums[0];
		int temp;

		for (int i = 1; i < nums.length; i++) {
			temp = max; // store the max because before updating min your max will already be updated

			max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
			min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

			if (max > ans) {
				ans = max;
			}
		}

		return ans;
	}
}
