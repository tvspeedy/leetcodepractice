package binary;

import defaultpackage.Utils;

/**
 * Given two integers a and b, return the sum of the two integers without using
 * the operators + and -.
 * 
 * @author speed
 *
 */
public class SumOfTwoIntegers371 {

	public static void main(String[] args) {
		// example 1
		int a = 1, b = 2;
		int output = 3;
		Utils.checkResult(getSum(a, b), output);
		
		//example 2
		int a2 = 2;
		int b2 = 3;
		int output2 = 5;Utils.checkResult(getSum(a2, b2), output2);

	}

	public static int getSum(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}

		return a;

	}

}
