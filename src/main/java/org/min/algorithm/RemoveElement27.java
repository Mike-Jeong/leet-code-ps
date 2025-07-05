package org.min.algorithm;

// https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
// solved at 06.07.2025 00:55
public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int pointerLeft = 0;
        int pointerRight = nums.length - 1;

        while (nums.length > 0 && pointerLeft <= pointerRight) {
            if (nums[pointerRight] == val) {
                pointerRight--;
                continue;
            }

            if (nums[pointerLeft] == val) {
                nums[pointerLeft] = nums[pointerRight];
                nums[pointerRight] = val;
                continue;
            }

            pointerLeft++;
        }

        return pointerLeft;
    }
}
