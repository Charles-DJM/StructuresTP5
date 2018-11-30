package com.company;

public class LinkedIntList implements IntList {

    private Cell first;

    public LinkedIntList() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public Cell getHead(){
        return first;
    }

    public IntList getTail(){
        return first.getTail();
    }

    @Override
    public IntList cons(int n) {
        if(isEmpty()){
            first = new Cell(n, null);
            return this;
        }
        return first.cons(n);
    }

    @Override
    public int length() {
        return first.length();
    }

    @Override
    public void addInt(int n) {
       if(!isEmpty()) first.addInt(n);
    }

    @Override
    public IntList concat(IntList list) {
        return null;
    }

    public IntListIterator iterator(){
        return new IntListIterator(this);
    }

}
