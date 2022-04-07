package array;

import java.util.Arrays;

import defaultpackage.Utils;

/**
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 * @author speed
 *
 */
public class MajorityElements169 {

	public static void main(String[] args) {
		int[] input1 = { 3, 2, 3 };
		int output1 = 3;

		//Utils.checkResult(majorityElement(input1), output1);

		int[] input2 = { 2, 2, 1, 1, 1, 2, 2 };
		int output2 = 2;
		Utils.checkResult(majorityElement(input2), output2);

	}

	public static int majorityElement(int[] nums) {

		int majNumber = (int) Math.ceil(nums.length / 2.0);
		int count = 1;
		Arrays.sort(nums);
		int numToCheck = nums[0];
		

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == numToCheck) {
				count++;
				if (count >= majNumber) {
					return numToCheck;
				}
			} else {
				// reset
				count = 1;
				numToCheck = nums[i];
			}
		}

		return count;
	}

}
