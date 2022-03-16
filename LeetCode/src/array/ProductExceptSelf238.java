package array;

import defaultpackage.Utils;

/**
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * 
 * @author speed
 *
 */
public class ProductExceptSelf238 {

	public static void main(String[] args) {

		// Example 1
		int[] nums = { 1, 2, 3, 4 };
		int[] output = { 24, 12, 8, 6 };

		Utils.checkResult(productExceptSerlf(nums), output);
		
		//Example 2
		int[] nums2 = {-1, 1, 0, -3, 3};
		int[] output2 = {0, 0, 9, 0, 0};
		Utils.checkResult(productExceptSerlf(nums2), output2);

	}

	// Have to multiply the values TWICE
	// Starting with 1 and moving left to right until the end,
	// them starting with 1 and moving right to left
	private static int[] productExceptSerlf(int[] nums) {

		int[] result = new int[nums.length];
		result[0] = 1;

		//Left to Right
		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i-1] * nums[i-1];
		}
		int right =1;
		//Right to left
		for(int i = nums.length -1; i >=0;i--) {
			result[i]= result[i] * right;
			right = right * nums[i];
		}
		
		
		return result;
	}

}
