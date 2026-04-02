package com.practice;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> arr_set = new HashSet<>();

        for (int i : aliceSizes) {
            sumA += i;
        }

        for (int i : bobSizes) {
            sumB += i;
            arr_set.add(i);
        }


        for (int i : aliceSizes) {
            int diff = (sumB - sumA) / 2 + i;
            if (arr_set.contains(diff)) {
                
                return new int[]{i , diff};
                
            }
        }

        return new int[]{};

    }

    public static void main(String[] args) {
        FairCandySwap fairCandySwap = new FairCandySwap();
        int[] aliceSizes = {1, 2, 5};
        int[] bobSizes = {2, 4};
        int[] result = fairCandySwap.fairCandySwap(aliceSizes, bobSizes);
        System.out.println("Alice should swap: " + result[0] + " with Bob's: " + result[1]);
    }
}
