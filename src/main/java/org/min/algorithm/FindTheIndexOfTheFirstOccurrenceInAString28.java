package org.min.algorithm;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 22.07.2025 23:55
public class FindTheIndexOfTheFirstOccurrenceInAString28 {

    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
