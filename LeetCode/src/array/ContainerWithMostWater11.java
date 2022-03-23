package array;

import defaultpackage.Utils;

/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i,
 * height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * @author speed
 *
 */
public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 25, 7 };
		int output = 49;
		// The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In
		// this case, the max area of water (blue section)
		// the container can contain is 49.

		Utils.checkResult(maxArea(height), output);

		// Example 2
		int[] height2 = { 1, 1 };
		int output2 = 1;
		Utils.checkResult(maxArea(height2), output2);

		// wrong answer
		int[] height3 = { 1, 2, 4, 3 };
		int output3 = 4;
		Utils.checkResult(maxArea(height3), output3);
	}

	public static int maxArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}

		int maxArea = 0;
		int tempArea = 0;
		int i = 0;
		int j = height.length - 1;

		while (i < j) {
			tempArea = Math.min(height[i], height[j]) * (j - i);
			if (tempArea > maxArea) {
				maxArea = tempArea;
			}
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}

		}

		return maxArea;
	}

}
