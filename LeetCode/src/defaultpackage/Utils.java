package defaultpackage;

import java.util.Arrays;
import java.util.List;

/**
 * Utility method for Leetcode Practice
 * 
 * @author speed
 *
 */
public class Utils {

	private static final String RESULT_CORRECT = "Result is correct";
	private static final String RESULT_NOT_CORRECT = "Result is NOT correct";

	private static final String CALCULATED_RESULT = "Calculated Result: ";
	private static final String EXPECTED_OUTPUT = "Expected output: ";

	public static void checkResult(int[] nums, int[] output) {
		System.out.println(CALCULATED_RESULT + Arrays.toString(nums));
		System.out.println(EXPECTED_OUTPUT + Arrays.toString(output));
		System.out.println(Arrays.equals(nums, output) ? RESULT_CORRECT : RESULT_NOT_CORRECT);
	}

	public static void checkResult(int input, int output) {
		System.out.println(CALCULATED_RESULT + input);
		System.out.println(EXPECTED_OUTPUT + output);
		System.out.println(input == output ? RESULT_CORRECT : RESULT_NOT_CORRECT);

	}

	public static void checkResult(boolean input, boolean output) {
		System.out.println(CALCULATED_RESULT + input);
		System.out.println(EXPECTED_OUTPUT + output);
		System.out.println(input == output ? RESULT_CORRECT : RESULT_NOT_CORRECT);

	}

	public static void checkResult(List<List<Integer>> threeSum, int[][] output) {
		System.out.println(CALCULATED_RESULT + threeSum);
		System.out.println(EXPECTED_OUTPUT + Arrays.deepToString(output));
//		System.out.println( == output ? RESULT_CORRECT : RESULT_NOT_CORRECT);

	}
}
