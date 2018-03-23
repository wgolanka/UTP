package com.company;

public class MapperString implements Mapper<String, Integer> {

    @Override
    public String map(String arg, Integer val) {
        return String.valueOf(arg.length() + val);
    }
}
