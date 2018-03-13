package com.company;

public class SelectorImpl<T> implements Selector<T> {


    @Override
    public Boolean select(T arg) {
        if((Integer) arg < 10){
            return true;
        }
        return false;
    }

}
