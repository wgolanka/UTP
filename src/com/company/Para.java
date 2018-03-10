package com.company;

public class Para<S,T> {

private S first;
private T last;

    public Para(S first, T last) {
        this.first=first;
        this.last=last;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    public static void main(String[] args){
        Para<String, Integer> p1 = new Para<>("Ala", 2);

    }
}
