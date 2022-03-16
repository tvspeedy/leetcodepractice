package array;

import java.util.Arrays;

/**
 * Utility method for Leetcode Practice
 * 
 * @author speed
 *
 */
public class Utils {

	private static final String RESULT_CORRECT = "Result is correct";
	private static final String RESULT_NOT_CORRECT = "Result is NOT correct";

	/**
	 * 
	 * @param nums
	 * @param output
	 */
	public static void checkResult(int[] nums, int[] output) {
		System.out.println("Calculated Result: " + Arrays.toString(nums));
		System.out.println("Expected output: " + Arrays.toString(output));
		System.out.println(Arrays.equals(nums, output) ? RESULT_CORRECT : RESULT_NOT_CORRECT);
	}

	/**
	 * 
	 * @param input
	 * @param output
	 */
	public static void checkResult(int input, int output) {
		System.out.println("Calculated Result: " + input);
		System.out.println("Expected output: " + output);
		System.out.println(input == output ? RESULT_CORRECT : RESULT_NOT_CORRECT);

	}
}
