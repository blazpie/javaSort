package com.codecool.blazpie;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

    @Override
    public List<Integer> sort(List<Integer> input) {

        if (input.size() < 2) {
            return input;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (i >= (input.size() / 2)) {
                right.add(input.get(i));
            } else {
                left.add(input.get(i));
            }
        }

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {

        List<Integer> result = new ArrayList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) <= right.get(0)) {
                result.add(left.remove(0));
            } else {
                result.add((right.remove(0)));
            }
        }
        result.addAll(left.isEmpty() ? right : left);
        return result;
    }
}

