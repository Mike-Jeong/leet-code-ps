package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JumpGame55Test {

    @DisplayName("Test with the case given in \"55. Jump Game\"")
    @ParameterizedTest
    @CsvSource({
            "'2,3,1,1,4', true",
            "'3,2,1,0,4', false"
    })
    void canJump(String maximumJumpLengthsString, boolean answer) {

        int[] maximumJumpLengths = StringUtil.convertStringToIntArray(maximumJumpLengthsString);

        JumpGame55 jumpGame55 = new JumpGame55();
        boolean result = jumpGame55.canJump(maximumJumpLengths);

        assertThat(result).isEqualTo(answer);

    }
}