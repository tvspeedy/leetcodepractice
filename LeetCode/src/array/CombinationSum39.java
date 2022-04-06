package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import defaultpackage.Utils;

/**
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen
 * numbers sum to target. You may return the combinations in any order.
 * 
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen
 * numbers is different.
 * 
 * It is guaranteed that the number of unique combinations that sum up to target
 * is less than 150 combinations for the given input.
 * 
 * @author speed
 *
 */
public class CombinationSum39 {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		int[][] output = { { 2, 2, 3 }, { 7 } };

		Utils.checkResult(combinationSum(candidates, target), output);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> combs = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(combs, new ArrayList<>(), candidates, target, 0);
		return combs;
	}

	private static void backtrack(List<List<Integer>> lst, List<Integer> tmpList, int[] candidates, int remaining,
			int start) {
		if (remaining < 0) {
			return;

		} else if (remaining == 0) {
			lst.add(new ArrayList<>(tmpList));
		} else {
			for(int i = start; i < candidates.length; i++) {
				tmpList.add(candidates[i]);
				backtrack(lst, tmpList, candidates, remaining - candidates[i], i);
				tmpList.remove(tmpList.size() - 1);
			}
		}

	}

}
