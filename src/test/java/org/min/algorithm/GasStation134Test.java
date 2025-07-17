package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GasStation134Test {

    @DisplayName("Test with the case given in \"134. Gas Station\"")
    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4,5', '3,4,5,1,2', 3",
            "'2,3,4', '3,4,3', -1"
    })
    void canCompleteCircuit(String gassString, String costsString, int answer) {
    }
}