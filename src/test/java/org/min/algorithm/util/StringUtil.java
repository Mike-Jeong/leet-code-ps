package org.min.algorithm.util;

import java.util.Arrays;

public class StringUtil {
    public static int[] convertStringToIntArray(String inputString) {
        int[] convertedInputArray = inputString == null || inputString.trim().isEmpty()
                ? new int[0]
                : Arrays.stream(inputString.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        return convertedInputArray;
    }
}
