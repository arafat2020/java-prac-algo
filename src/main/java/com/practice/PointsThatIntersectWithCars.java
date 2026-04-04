package com.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointsThatIntersectWithCars {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for (List<Integer> i: nums){
            incertInt(i, set);
        }
        return set.size();
    }

    private void incertInt(List<Integer> points, Set<Integer> set){
        for (int i = points.get(0); i <= points.get(1); i++){
            set.add(i);
        }
    }

    public static void main(String[] args) {
        PointsThatIntersectWithCars pointsThatIntersectWithCars = new PointsThatIntersectWithCars();
        List<List<Integer>> nums = List.of(List.of(1, 3), List.of(2, 4), List.of(5, 6));
        System.out.println(pointsThatIntersectWithCars.numberOfPoints(nums));
    }
}
