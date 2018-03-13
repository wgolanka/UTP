package com.company;

public class SelectorInteger implements Selector<Integer>{

    @Override
    public Boolean select(Integer arg) {
        return arg < 10;
    }
}
