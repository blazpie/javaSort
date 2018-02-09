package com.codecool.blazpie;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements Sort {

    @Override
    public List<Integer> sort(List<Integer> input) {
        if (input.size() < 2) {
            return input;
        }
        List<Integer> result = new ArrayList<>();
        Integer pivot = input.remove(input.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (Integer elem : input) {
            if (elem < pivot) {
                right.add(elem);
            } else {
                left.add(elem);
            }
        }

        result.addAll(sort(right));
        result.add(pivot);
        result.addAll(sort(left));

        return result;
    }
}
