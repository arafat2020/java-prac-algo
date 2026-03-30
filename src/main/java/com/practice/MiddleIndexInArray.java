package com.practice;

public class MiddleIndexInArray {
    public int findMiddleIndex(int[] nums) {
        int[] prefex_arr = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            prefex_arr[i] = prefex_arr[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefex_arr[i] == prefex_arr[nums.length] - prefex_arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MiddleIndexInArray middleIndexInArray = new MiddleIndexInArray();
        int[] nums = { 2, 3, -1, 8, 4 };
        System.out.println(middleIndexInArray.findMiddleIndex(nums));
    }
}
