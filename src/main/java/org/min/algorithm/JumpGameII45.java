package org.min.algorithm;

// https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 15.07.2025 23:50
public class JumpGameII45 {

    public int jump(int[] nums) {
        int count = 0;
        int currentEnd = 0;
        int furthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(furthest, i + nums[i]);

            if (currentEnd == i) {
                count++;
                currentEnd = furthest;
            }
        }

        return count;
    }
}