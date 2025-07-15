package org.min.algorithm;

import java.util.Arrays;

// https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 15.07.2025 23:50
public class JumpGameII45 {

    private int[] minimumNumberOfJumps;
    private int[] maximumJumpLengths;

    public int jump(int[] nums) {
        maximumJumpLengths = nums;
        minimumNumberOfJumps = new int[nums.length];
        Arrays.fill(minimumNumberOfJumps, Integer.MAX_VALUE);

        movePosition(0, 0); //initially positioned at the array's first index

        return minimumNumberOfJumps[nums.length - 1];
    }

    private void movePosition(int position, int count) {
        if (position >= maximumJumpLengths.length) {
            return;
        }

        if (minimumNumberOfJumps[position] <= count) {
            return;
        }

        minimumNumberOfJumps[position] = count;

        for (int i = 1; i <= maximumJumpLengths[position]; i++) {
            movePosition(position + i, count + 1);
        }
    }
}