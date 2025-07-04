package org.min.algorithm;

// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 05.07.2025 01:50
public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        int actualPointer = m + n - 1;

        while (nums2Pointer >= 0) {
            if (nums1Pointer >= 0 && nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[actualPointer] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[actualPointer] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            actualPointer--;
        }
    }
}
