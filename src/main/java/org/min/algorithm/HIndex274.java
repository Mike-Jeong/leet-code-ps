package org.min.algorithm;

import java.util.Arrays;

// https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 16.07.2025 23:50
public class HIndex274 {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;

        for (int i = 0; i < citations.length; i++) {
            int a = length - i;

            if (citations[i] >= a) {
                return a;
            }
        }

        return 0;
    }
}