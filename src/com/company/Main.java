package com.company;

import java.util.Arrays;
import java.util.List;

import static com.company.ListCreator.collectFrom;


public class Main {

    public Main() {
        List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);
        System.out.println(test1(src1));

        List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv" );
        System.out.println(test2(src2));
    }

    public List<Integer> test1(List<Integer> src) {
        Selector sel = new SelectorInteger();
        Mapper map = new MapperInteger();
        return collectFrom(src).when(sel).mapEvery(map);
    }

    public List<Integer> test2(List<String> src) {
        Selector sel = new SelectorString();
        Mapper map = new MapperString();
        return collectFrom(src).when(sel).mapEvery(map);
    }

    public static void main(String[] args) {
        new Main();
    }
}
