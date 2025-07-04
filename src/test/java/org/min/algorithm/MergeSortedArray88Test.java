package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArray88Test {

    @DisplayName("Test with the case given in \"88. Merge Sorted Array\"")
    @ParameterizedTest
    @CsvSource({
            "'1,2,3,0,0,0', 3, '2,5,6', 3, '1,2,2,3,5,6'",
            "'1', 1, ' ', 0, '1'",
            "'0', 0, '1', 1, '1'"
    })
    void merge(String nums1String, int m, String nums2String, int n, String answerString) {

        int[] nums1 = convertStringToIntArray(nums1String);
        int[] nums2 = convertStringToIntArray(nums2String);
        int[] answer = convertStringToIntArray(answerString);

        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        mergeSortedArray88.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(answer);
    }

    private int[] convertStringToIntArray(String inputString) {
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
