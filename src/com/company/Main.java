package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {
        List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);
        System.out.println(test1(src1));

        List<String> src2 = Arrays.asList("zzz", "ass", "sdsadsdsdas");
        System.out.println(test2(src2));

        List<Double> src3 = Arrays.asList(1.0, 7.0, 9.0, 11.0, 12.0);
        System.out.println(test3(src3));

    }

    public List<Integer> test1(List<Integer> src) {
        Selector sel = new SelectorInteger();
        Mapper map = new MapperInteger();
        return ListCreator.collectFrom(src).when(sel).mapEvery(map);
    }

    public List<Integer> test2(List<String> src) {
        Selector sel = new SelectorString();
        Mapper map = new MapperString();
        return ListCreator.collectFrom(src).when(sel).mapEvery(map);
    }

    public List<Double> test3(List<Double> src) {
        Selector sel = new SelectorInteger();
        Mapper map = new MapperInteger();
        return ListCreator.collectFrom(src).when(sel).mapEvery(map);
    }

    public static void main(String[] args) {
        new Main();
    }
}
