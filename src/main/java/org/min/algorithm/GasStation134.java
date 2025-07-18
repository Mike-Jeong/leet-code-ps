package org.min.algorithm;

// https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 17.07.2025 23:50
public class GasStation134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0;
        int sCost = 0;
        int res = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            sGas += gas[i];
            sCost += cost[i];
        }

        if (sGas < sCost) {
            return -1;
        }

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }
}