package org.min.algorithm;

// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 09.07.2025 23:57
public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return major;
    }
}