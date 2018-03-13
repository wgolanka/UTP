package com.company;

import java.util.List;

public interface Mapper<T> {

    public List<T> map(T arg);
}
