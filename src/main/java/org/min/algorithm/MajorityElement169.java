package org.min.algorithm;

// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 09.07.2025 23:57
public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int basis = 0;
        for (int i = 0; i < nums.length; i++) {
             basis = Math.max(Math.abs(nums[i]), basis);
        }

        int[] indexes = new int[2 * basis + 2];

        for (int i = 0; i < nums.length; i++) {
            indexes[nums[i] + basis]++;

            if (indexes[nums[i] + basis] > nums.length / 2) {
                return nums[i];
            }
        }

        return nums[0];
    }
}