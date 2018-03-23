package com.company;


public class MapperInteger implements Mapper<Number, Number>{

    @Override
    public Number map(Number arg, Number val) {
        return arg.doubleValue() + val.doubleValue();
    }
}
