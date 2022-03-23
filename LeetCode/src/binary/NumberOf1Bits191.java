package binary;

import defaultpackage.Utils;

/**
 * Write a function that takes an unsigned integer and returns the number of '1'
 * bits it has (also known as the Hamming weight).
 * 
 * @author speed
 *
 */
public class NumberOf1Bits191 {

	public static void main(String[] args) {
		// example 1
		int n = 00000000000000000000000000001011;
		int output = 3;

		Utils.checkResult(hammingWeight(n), output);

	}

	/**
	 * NOTE: n came in as wrong value for example 1, used this method to solve in
	 * LC, not in workspace.
	 */
	public static int hammingWeight(int n) {
		int ones = 0;

		// all ints will be of length 32.
		// check if the 1 bit (right most bit) is one, if it is, add to the count
		// then shift the values to the right
		for (int i = 0; i < 32; i++) {
			ones += n & 1;
			n = n >> 1;
		}

		return ones;

	}

}
