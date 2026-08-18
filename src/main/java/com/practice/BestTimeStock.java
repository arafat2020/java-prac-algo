package com.practice;

public class BestTimeStock {
    public static int bestProfit(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            lowestPrice = Math.min(i < prices.length - 1 ? prices[i] : lowestPrice, lowestPrice);
            maxProfit = Math.max(prices[i] - lowestPrice, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(bestProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
