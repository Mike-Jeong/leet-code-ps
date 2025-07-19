package org.min.algorithm;

// https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 19.07.2025 23:52
public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                continue;
            }

            break;
        }

        return length;
    }
}
