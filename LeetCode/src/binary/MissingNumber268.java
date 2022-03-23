package binary;

import java.util.Arrays;

import defaultpackage.Utils;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 * 
 * @author speed
 *
 */
public class MissingNumber268 {

	public static void main(String[] args) {
		// Example 1
		int[] nums = { 3, 0, 1 };
		int output = 2;
		Utils.checkResult(missingNumber(nums), output);

		// example 2
		int[] nums2 = { 0, 1 };
		int output2 = 2;
		Utils.checkResult(missingNumber(nums2), output2);

		// example 2
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int output3 = 8;
		Utils.checkResult(missingNumber(nums3), output3);

	}

	public static int missingNumber(int[] nums) {
		int expected = nums.length * (nums.length + 1) / 2;
		int sum = Arrays.stream(nums).sum();
		int diff = expected - sum;

		return diff;
	}

}
