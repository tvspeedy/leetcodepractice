package array;

import java.util.Arrays;
import java.util.List;

import defaultpackage.Utils;

/**
 * There is an integer array nums sorted in ascending order (with distinct
 * values).
 * 
 * Prior to being passed to your function, nums is possibly rotated at an
 * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
 * and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * @author speed
 *
 */
public class SearchRotatedSortedArray33 {

	public static void main(String[] args) {
		//Example 1
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int output = 4;

		Utils.checkResult(search(nums, target), output);
		
		//Example2
		int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
		int target2 = 3;
		int output2 = -1;
		Utils.checkResult(search(nums2, target2), output2);
		
		//Example 3
		int[] nums3 = { 1};
		int target3 = 0;
		int output3 = -1;
		Utils.checkResult(search(nums3, target3), output3);
		
	}

	public static int search(int[] nums, int target) {
		List<Integer> lst = Arrays.stream(nums).boxed().toList();
		
		return lst.indexOf(target);
	}

}
