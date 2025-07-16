package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class HIndex274Test {

    @DisplayName("Test with the case given in \"274. H-Index\"")
    @ParameterizedTest
    @CsvSource({
            "'3,0,6,1,5', 3",
            "'1,3,1', 1"
    })
    void hIndex(String citationsString, int answer) {

        int[] citations = StringUtil.convertStringToIntArray(citationsString);

        HIndex274 hIndex274 = new HIndex274();
        int result = hIndex274.hIndex(citations);

        assertThat(result).isEqualTo(answer);
    }
}