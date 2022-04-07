package array;

import defaultpackage.Utils;

public class SortColors73 {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		int[] output = { 0, 0, 1, 1, 2, 2 };
		sortColors(nums);
		// Utils.checkResult(nums, output);

		int[] nums2 = { 1, 2, 0 };
		int[] output2 = { 0, 1, 2 };
		sortColors(nums2);
		Utils.checkResult(nums2, output2);

	}

	private static void sortColors(int[] nums) {
		if (nums == null || nums.length == 0) {
			nums = new int[0];
		}

		int tmp = 0;

		if (nums.length < 3) {
			for (int i = 0; i < nums.length - 1; i++) {

				if (nums[i] > nums[i + 1]) {
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
					i -= 2;
				}

				if (i <= 0) {
					i = 0;
				}

			}
		} else {
			for (int i = 1; i < nums.length - 1; i++) {

				if (nums[i] > nums[i + 1]) {
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
					i -= 2;
				} else if (nums[i] < nums[i - 1]) {
					tmp = nums[i];
					nums[i] = nums[i - 1];
					nums[i - 1] = tmp;
					i -= 2;
				}
				if (i <= 0) {
					i = 0;
				}
			}
		}

	}

}
