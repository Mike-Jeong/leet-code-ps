package org.min.algorithm;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 07.07.2025 23:55
public class RemoveDuplicatesFromSortedArray26 {

    public int removeDuplicates(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int i = 0;
        for (int num:numsSet) {
            nums[i] = num;
            i++;
        }

        return numsSet.size();
    }
}
