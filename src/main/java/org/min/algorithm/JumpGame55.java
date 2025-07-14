package org.min.algorithm;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 14.07.2025 23:15
public class JumpGame55 {

    private boolean[] isVisited;
    private int[] maximumJumpLength;

    public boolean canJump(int[] nums) {
        isVisited = new boolean[nums.length];
        maximumJumpLength = nums;

        movePosition(0); //initially positioned at the array's first index

        return isVisited[nums.length - 1];
    }

    private void movePosition(int position) {
        if (position >= maximumJumpLength.length) {
            return;
        }

        if (isVisited[position]) {
            return;
        }

        isVisited[position] = true;

        for (int i = 1; i <= maximumJumpLength[position]; i++) {
            movePosition(position + i);
        }
    }
}
