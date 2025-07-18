package org.min.algorithm;

// https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 18.07.2025 23:30
public class RomanToInteger13 {

    public int romanToInt(String s) {
        int answer = 0;
        int num = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (4 * num < answer) {
                answer -= num;
                continue;
            }

            answer += num;
        }

        return answer;
    }
}
