package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

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

        int[] nums1 = StringUtil.convertStringToIntArray(nums1String);
        int[] nums2 = StringUtil.convertStringToIntArray(nums2String);
        int[] answer = StringUtil.convertStringToIntArray(answerString);

        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        mergeSortedArray88.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(answer);
    }
}
