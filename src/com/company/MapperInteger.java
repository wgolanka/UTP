package com.company;


public class MapperInteger implements Mapper<Integer>{


    @Override
    public Integer map(Integer arg) {
        return arg + 10;
    }
}
