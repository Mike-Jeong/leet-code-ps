package org.min.algorithm;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 07.07.2025 23:55
public class RemoveDuplicatesFromSortedArray26 {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;

        for(int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
