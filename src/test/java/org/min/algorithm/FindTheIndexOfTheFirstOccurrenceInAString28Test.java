package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheIndexOfTheFirstOccurrenceInAString28Test {

    @DisplayName("Test with the case given in \"28. Find the Index of the First Occurrence in a String\"")
    @ParameterizedTest
    @CsvSource({
            "'sadbutsad', 'sad', 0",
            "'leetcode', 'leeto', -1"
    })
    void strStr(String haystack, String needle, int answer) {

        FindTheIndexOfTheFirstOccurrenceInAString28 findTheIndexOfTheFirstOccurrenceInAString28 = new FindTheIndexOfTheFirstOccurrenceInAString28();
        int result = findTheIndexOfTheFirstOccurrenceInAString28.strStr(haystack, needle);

        assertThat(result).isEqualTo(answer);
    }
}
