package org.min.algorithm;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 21.07.2025 23:55
public class LongestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        for (int i = 0; i < Math.min(firstString.length(), lastString.length()); i++) {
            if (firstString.charAt(i) != lastString.charAt(i)) {
                return stringBuilder.toString();
            }

            stringBuilder.append(firstString.charAt(i));
        }

        return stringBuilder.toString();
    }
}
