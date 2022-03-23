package array;

import defaultpackage.Utils;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1
 * and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * 
 * [4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated
 * 7 times.
 * 
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results
 * in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * Given the sorted rotated array nums of unique elements, return the minimum
 * element of this array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * @author speed
 *
 */
public class MinRotatedSortedArr153 {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int output = 1;
		Utils.checkResult(findMin(nums), output);
		// Explanation: The original array was [1,2,3,4,5] rotated 3 times.

		int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
		int output2 = 0;
		Utils.checkResult(findMin(nums2), output2);
		// Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4
		// times.

		int[] nums3 = { 11, 13, 15, 17 };
		int output3 = 11;
		Utils.checkResult(findMin(nums3), output3);
		// Explanation: The original array was [11,13,15,17] and it was rotated 4 times.

	}

	public static int findMin(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int min = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] > nums[i]) {
				min = nums[i];
				break;
			}
		}
		
		
		return min;
		
	}
}
