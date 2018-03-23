package com.company;

public class SelectorInteger implements Selector<Number>{

    @Override
    public Boolean select(Number arg) {
        return arg.doubleValue() < 10;
    }
}
