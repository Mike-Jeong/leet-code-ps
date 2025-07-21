package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefix14Test {

    @DisplayName("Test with the case given in \"14. Longest Common Prefix\"")
    @ParameterizedTest
    @MethodSource("provideStringArrays")
    void longestCommonPrefix(String[] strs, String answer) {

        LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();
        String result = longestCommonPrefix14.longestCommonPrefix(strs);

        assertThat(result).isEqualTo(answer);
    }

    static Stream<Arguments> provideStringArrays() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }
}