package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArray26Test {

    @DisplayName("Test with the case given in \"26. Remove Duplicates from Sorted Array\"")
    @ParameterizedTest
    @CsvSource({
            "'1,1,2', '1,2'",
            "'0,0,1,1,1,2,2,3,3,4', '0,1,2,3,4'"
    })
    void removeDuplicates(String numsString, String answerString) {

        int[] nums = StringUtil.convertStringToIntArray(numsString);
        int[] answer = StringUtil.convertStringToIntArray(answerString);

        RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray26();
        int k = removeDuplicatesFromSortedArray26.removeDuplicates(nums);

        int[] result = Arrays.copyOf(nums, k);

        assertThat(result).containsExactly(answer);
    }
}