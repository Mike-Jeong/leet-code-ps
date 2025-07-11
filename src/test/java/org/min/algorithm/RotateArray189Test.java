package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArray189Test {

    @DisplayName("Test with the case given in \"189. Rotate Array\"")
    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4,5,6,7', 3, '5,6,7,1,2,3,4'",
            "'-1,-100,3,99', 2, '3,99,-1,-100'",
            "'1,2,3', 2, '2,3,1'"
    })
    void rotate(String numsString, int k, String answerString) {

        int[] nums = StringUtil.convertStringToIntArray(numsString);
        int[] answer = StringUtil.convertStringToIntArray(answerString);

        RotateArray189 rotateArray189 = new RotateArray189();
        rotateArray189.rotate(nums, k);

        assertThat(nums).containsExactly(answer);
    }
}
