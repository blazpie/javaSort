package com.codecool.blazpie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random gen = new Random();
        List<Integer> input = new ArrayList<>();

        int n = 12132;
        gen.ints(n).forEach(input::add);

        Sort sort = new QuickSort();

        List<Integer> output = sort.sort(input);

        System.out.println(output);
    }
}
