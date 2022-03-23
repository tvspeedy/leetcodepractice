package binary;

import defaultpackage.Utils;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i
 * (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * 
 * @author speed
 *
 */
public class CountingBits338 {

	public static void main(String[] args) {
		// Example 1
		int n = 2;
		int[] output = { 0, 1, 1 };
		// Explanation:
		// 0 -> 0 (zero 1)
		// 1 -> 1 (one 1)
		// 2 -> 10 (one 1)
		Utils.checkResult(countBits(n), output);

		// example 2
		int n2 = 5;
		int[] output2 = { 0, 1, 1, 2, 1, 2 };
		// 0 --> 0 0
		// 1 --> 1 1
		// 2 --> 10 1
		// 3 --> 11 2
		// 4 --> 100 1
		// 5 --> 101 2

		// 6 -> 0110 2
		// 7 -> 0111 3
		// 8 -> 1000 1
		// 9 -> 1001 2
		Utils.checkResult(countBits(n2), output2);

	}

	public static int[] countBits(int n) {
		int[] retArr = new int[n + 1];
		retArr[0] = 0;
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			if (pow * 2 == i) {
				pow *= 2;
				
			}

			retArr[i] = retArr[i - pow] +1;
		}

		return retArr;
	}

}
