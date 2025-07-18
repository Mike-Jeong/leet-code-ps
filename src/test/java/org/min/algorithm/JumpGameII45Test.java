package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class JumpGameII45Test {

    @DisplayName("Test with the case given in \"45. Jump Game II\"")
    @ParameterizedTest
    @CsvSource({
            "'2,3,1,1,4', 2",
            "'2,3,0,1,4', 2"
    })
    void jump(String maximumJumpLengthsString, int answer) {

        int[] maximumJumpLengths = StringUtil.convertStringToIntArray(maximumJumpLengthsString);

        JumpGameII45 jumpGameII45 = new JumpGameII45();
        int result = jumpGameII45.jump(maximumJumpLengths);

        assertThat(result).isEqualTo(answer);
    }
}
