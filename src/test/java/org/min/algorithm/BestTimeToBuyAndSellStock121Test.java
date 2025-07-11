package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStock121Test {

    @DisplayName("Test with the case given in \"121. Best Time to Buy and Sell Stock\"")
    @ParameterizedTest
    @CsvSource({
            "'7,1,5,3,6,4', 5",
            "'7,6,4,3,1', 0"
    })
    void maxProfit(String pricesString, int answer) {

        int[] prices = StringUtil.convertStringToIntArray(pricesString);

        BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock121();
        int result = bestTimeToBuyAndSellStock121.maxProfit(prices);

        assertThat(result).isEqualTo(answer);
    }
}