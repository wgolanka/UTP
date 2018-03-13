package com.company;

public class MapperString implements Mapper<String> {

    @Override
    public String map(String arg) {
        return String.valueOf(arg.length() + 10);
    }
}
