package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import defaultpackage.Utils;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * @author speed
 *
 */
public class ThreeSum15 {

	public static void main(String[] args) {
		// Example 1
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		int[][] output = { { -1, -1, 2 }, { -1, 0, 1 } };
		Utils.checkResult(threeSum(nums), output);

		// Example 2
		int[] nums2 = {};
		int[][] output2 = { {} };
		Utils.checkResult(threeSum(nums), output);
		// Example 3
		int[] nums3 = { 0 };
		int[][] output3 = { {} };
		Utils.checkResult(threeSum(nums), output);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		
		int iNum, sum, j, k;
		
		for(int i = 0; i< nums.length-3; i++) {
			iNum = nums[i];
			j = i+1;
			k = nums.length-1;
			while(j < k) {
				sum = iNum + nums[j] + nums[k];
				if(sum == 0) {
					set.add(Arrays.asList(iNum, nums[j], nums[k]));
					j++;
					k--;
				}
				else if(sum > 0) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		
		
		
		return new ArrayList<>(set);
	}

}
