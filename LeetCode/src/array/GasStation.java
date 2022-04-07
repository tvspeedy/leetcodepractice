package array;

import defaultpackage.Utils;

/**
 * There are n gas stations along a circular route, where the amount of gas at
 * the ith station is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from the ith station to its next (i + 1)th station. You begin the
 * journey with an empty tank at one of the gas stations.
 * 
 * Given two integer arrays gas and cost, return the starting gas station's
 * index if you can travel around the circuit once in the clockwise direction,
 * otherwise return -1. If there exists a solution, it is guaranteed to be
 * unique
 * 
 * @author speed
 *
 */
public class GasStation {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		int output = 3;

		Utils.checkResult(canCompleteCircuit(gas, cost), output);

		int[] gas2 = { 2, 3, 4 };
		int[] cost2 = { 3, 4, 3 };
		int output2 = -1;

		Utils.checkResult(canCompleteCircuit(gas2, cost2), output2);

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int tank;

		for (int startingSpot = 0; startingSpot < gas.length; startingSpot++) {
			// try all starting locations

			if (gas[startingSpot] >= cost[startingSpot]) {
				tank = gas[startingSpot];
				for (int i = 0; i < gas.length; i++) {

					tank -= cost[(i + startingSpot) % gas.length];
					if (tank < 0) {
						tank = -1;
						break;
					}
					tank += gas[(i + 1 + startingSpot) % gas.length];
					if (tank <= 0) {
						tank = -1;
						break;
					}
				}

				if (tank >= 0) {
					return startingSpot;
				}
			}
		}

		return -1;
	}

}
