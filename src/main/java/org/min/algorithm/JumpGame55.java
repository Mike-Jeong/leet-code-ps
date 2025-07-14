package org.min.algorithm;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 14.07.2025 23:15
public class JumpGame55 {

    public boolean canJump(int[] nums) {
        int reachable = 0;

        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }
}
