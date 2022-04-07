package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import defaultpackage.Utils;

/**
 * You are given an array of non-overlapping intervals intervals where
 * intervals[i] = [starti, endi] represent the start and the end of the ith
 * interval and intervals is sorted in ascending order by starti. You are also
 * given an interval newInterval = [start, end] that represents the start and
 * end of another interval.
 * 
 * Insert newInterval into intervals such that intervals is still sorted in
 * ascending order by starti and intervals still does not have any overlapping
 * intervals (merge overlapping intervals if necessary).
 * 
 * Return intervals after the insertion.
 * 
 * @author speed
 *
 */
public class InsertInterval57 {

	public static void main(String[] args) {
		int[][] interval1 = { { 1, 3 }, { 6, 9 } };
		int[] newInterval1 = { 2, 5 };
		int[][] output1 = { { 1, 5 }, { 6, 9 } };

		// Explanation [2, 5] is contained in [1,3], so it expands

		Utils.checkResult(insert(interval1, newInterval1), output1);
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> retArr = new LinkedList<>();
		for (int[] entry : intervals) {

			if (newInterval[1] < entry[0]) {
				retArr.add(entry);
			} else if (newInterval[0] > entry[1]) {
				retArr.add(entry);
			} else {
				newInterval[0] = Math.min(entry[0], newInterval[0]);
				newInterval[1] = Math.max(entry[1], newInterval[1]);
			}
		}

		return retArr.toArray(new int[retArr.size()][2]);
	}
}
