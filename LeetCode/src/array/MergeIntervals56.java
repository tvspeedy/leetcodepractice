package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import defaultpackage.Utils;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * @author speed
 *
 */
public class MergeIntervals56 {

	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] output = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
		// Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
		 Utils.checkResult(merge(intervals), output);

		int[][] intervals2 = { { 1, 4 }, { 4, 5 } };
		int[][] output2 = { { 1, 5 } };
		Utils.checkResult(merge(intervals2), output2);
		// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

	}

	public static int[][] merge(int[][] intervals) {

		if (intervals == null || intervals.length == 0) {
			return new int[0][0];
		}
		// Sort the arr
		Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
		List<int[]> retArr = new LinkedList<>();
		int startVal = intervals[0][0], endVal = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			int[] curInt = intervals[i];

			if (curInt[0] >= startVal && curInt[0] <= endVal) {
				endVal = Math.max(endVal, curInt[1]);
			} else {
				retArr.add(new int[] { startVal, endVal });
				startVal = curInt[0];
				endVal = curInt[1];
			}

		}
		retArr.add(new int[] { startVal, endVal });

		return retArr.toArray(new int[retArr.size()][]);
	}
}
