package com.company;

import java.util.ArrayList;
import java.util.List;


public class ListCreator<T>{

    List<T> objects;

    public ListCreator(List<T> src){
        objects = src;
    }

    public static <T> ListCreator<T> collectFrom(List<T> src){
        return new ListCreator<T>(src);
    }

    public ListCreator when(Selector<T> selector){
        List<T> newList = new ArrayList<>();

        for(T arg : this.objects){
            if(selector.select(arg)){
                newList.add(arg);
            }
        }

        objects = newList;
        return this;
    }

    public List<T> mapEvery(Mapper<T> map){

        List<T> newList = new ArrayList<>();

        for(T arg : this.objects){
          newList.add(map.map(arg));
        }

        objects = newList;
        return objects;
    }
}
