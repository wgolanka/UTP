package com.company;

public interface Mapper<T, S> {
    T map(T arg, S val);
}
