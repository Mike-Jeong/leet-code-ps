package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWord58Test {

    @DisplayName("Test with the case given in \"58. Length of Last Word\"")
    @ParameterizedTest
    @CsvSource({
            "'Hello World', 5",
            "'   fly me   to   the moon  ', 4",
            "'luffy is still joyboy', 6"
    })
    void lengthOfLastWord(String string, int answer) {

        LengthOfLastWord58 lengthOfLastWord58 = new LengthOfLastWord58();
        int result = lengthOfLastWord58.lengthOfLastWord(string);

        assertThat(result).isEqualTo(answer);
    }
}
