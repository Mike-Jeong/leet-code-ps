package org.min.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.min.algorithm.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockII122Test {

    @DisplayName("Test with the case given in \"122. Best Time to Buy and Sell Stock II\"")
    @ParameterizedTest
    @CsvSource({
            "'7,1,5,3,6,4', 7",
            "'1,2,3,4,5', 4",
            "'7,6,4,3,1', 0"
    })
    void maxProfit(String pricesString, int answer) {

        int[] prices = StringUtil.convertStringToIntArray(pricesString);

        BestTimeToBuyAndSellStockII122 bestTimeToBuyAndSellStockII122 = new BestTimeToBuyAndSellStockII122();
        int result = bestTimeToBuyAndSellStockII122.maxProfit(prices);

        assertThat(result).isEqualTo(answer);
    }
}
