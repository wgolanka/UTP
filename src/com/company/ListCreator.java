package com.company;

import java.util.List;

public class ListCreator<T> {

    public static ListCreator<Integer> collectFrom(List<Integer> src){
        return new ListCreator<Integer>();
    }
    
    public ListCreator<T> when(Selector<T> sel){
        return this;
    }

    public List<T> mapEvery(MapperImpl<T> map) {
        return ;
    }
}
