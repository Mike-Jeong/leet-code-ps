package org.min.algorithm;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
// solved at 12.07.2025 23:46
public class BestTimeToBuyAndSellStockII122 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
                continue;
            }

            if (prices[i] > buyPrice) {
                maxProfit += (prices[i] - buyPrice);
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
