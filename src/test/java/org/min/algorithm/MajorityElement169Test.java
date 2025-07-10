package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElement169Test {

    @DisplayName("Test with the case given in \"169. Majority Element\"")
    @ParameterizedTest
    @CsvSource({
            "'3,2,3', 3",
            "'2,2,1,1,1,2,2', '2'"
    })
    void majorityElement(String numsString, int answer) {

        int[] nums = StringUtil.convertStringToIntArray(numsString);

        MajorityElement169 majorityElement169 = new MajorityElement169();
        int result = majorityElement169.majorityElement(nums);

        assertThat(result).isEqualTo(answer);
    }
}
