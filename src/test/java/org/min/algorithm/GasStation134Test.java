package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class GasStation134Test {

    @DisplayName("Test with the case given in \"134. Gas Station\"")
    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4,5', '3,4,5,1,2', 3",
            "'2,3,4', '3,4,3', -1"
    })
    void canCompleteCircuit(String gasString, String costsString, int answer) {

        int[] gas = StringUtil.convertStringToIntArray(gasString);
        int[] costs = StringUtil.convertStringToIntArray(costsString);

        GasStation134 gasStation134 = new GasStation134();
        int result = gasStation134.canCompleteCircuit(gas, costs);

        assertThat(result).isEqualTo(answer);
    }
}