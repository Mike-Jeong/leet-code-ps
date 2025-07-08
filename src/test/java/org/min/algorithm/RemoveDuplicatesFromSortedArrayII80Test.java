package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayII80Test {

    @DisplayName("Test with the case given in \"80. Remove Duplicates from Sorted ArrayII\"")
    @ParameterizedTest
    @CsvSource({
            "'1,1,1,2,2,3', '1,1,2,2,3'",
            "'0,0,1,1,1,1,2,3,3', '0,0,1,1,2,3,3'"
    })
    void removeDuplicates(String numsString, String answerString) {

        int[] nums = StringUtil.convertStringToIntArray(numsString);
        int[] answer = StringUtil.convertStringToIntArray(answerString);

        RemoveDuplicatesFromSortedArrayII80 removeDuplicatesFromSortedArrayII80 = new RemoveDuplicatesFromSortedArrayII80();
        int k = removeDuplicatesFromSortedArrayII80.removeDuplicates(nums);

        int[] result = Arrays.copyOf(nums, k);

        assertThat(result).containsExactly(answer);
    }
}