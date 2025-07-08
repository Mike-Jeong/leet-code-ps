package org.min.algorithm;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
// solved at 08.07.2025 23:45
public class RemoveDuplicatesFromSortedArrayII80 {

    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
