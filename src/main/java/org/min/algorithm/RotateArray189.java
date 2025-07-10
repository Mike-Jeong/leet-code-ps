package org.min.algorithm;

// https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
// solved at 10.07.2025 23:23
public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        k = nums.length - k;

        for (int i = 0; i <= (k - 1) / 2; i++) {
            int temp = nums[k - 1 - i];
            nums[k - 1 - i] = nums[i];
            nums[i] = temp;
        }

        int mediumOfRemains = (nums.length - 1 + k - 1) / 2;
        int base = nums.length - 1 + k;
        for (int i = k; i <= mediumOfRemains; i++) {
            int temp = nums[base - i];
            nums[base - i] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[nums.length -1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;
        }
    }
}
