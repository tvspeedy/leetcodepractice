package binary;

import defaultpackage.Utils;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * @author speed
 *
 */
public class ReverseBits190 {

	public static void main(String[] args) {

		int n = 43261596;
		int output = 964176192;
		Utils.checkResult(reverseBits(n), output);
	}

	public static int reverseBits(int n) {
		return Integer.reverse(n); //lol
		
		
	}

}
