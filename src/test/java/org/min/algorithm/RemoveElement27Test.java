package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElement27Test {

    @DisplayName("Test with the case given in \"27. Remove Element\"")
    @ParameterizedTest
    @CsvSource({
            "'3,2,2,3', 3, '2,2'",
            "'0,1,2,2,3,0,4,2', 2, '0,1,4,0,3'"
    })
    void removeElement(String numsString, int val, String answerString) {

        int[] nums = StringUtil.convertStringToIntArray(numsString);
        int[] answer = StringUtil.convertStringToIntArray(answerString);

        RemoveElement27 removeElement27 = new RemoveElement27();
        int k = removeElement27.removeElement(nums, val);

        int[] result = Arrays.copyOf(nums, k);

        assertThat(result).containsExactlyInAnyOrder(answer);
    }
}
