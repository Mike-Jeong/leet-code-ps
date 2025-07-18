package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToInteger13Test {

    @DisplayName("Test with the case given in \"13. Roman to Integer\"")
    @ParameterizedTest
    @CsvSource({
            "'III', 3",
            "'LVIII', 58",
            "'MCMXCIV', 1994"
    })
    void romanToInt(String romanNumeral, int answer) {

        RomanToInteger13 r = new RomanToInteger13();
        int result = r.romanToInt(romanNumeral);

        assertThat(result).isEqualTo(answer);
    }
}
