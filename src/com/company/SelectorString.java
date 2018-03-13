package com.company;

public class SelectorString implements Selector<String> {
    @Override
    public Boolean select(String arg) {
        return arg.length() > 3;
    }
}
