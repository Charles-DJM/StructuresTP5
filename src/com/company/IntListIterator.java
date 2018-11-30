package com.company;

public class IntListIterator implements IntIterator{

    private Cell Iterator;

    public IntListIterator(LinkedIntList list){
        this.Iterator = list.getHead();
    }



    @Override
    public int next() {
        Iterator.getData();
        Iterator.getNextCell();
        if (this.hasNext()) {
            int myData = Iterator.getData();
            Iterator = Iterator.getNextCell();
            return myData;
        }
        return Iterator.getData();
    }

    @Override
    public boolean hasNext() {
        return !(Iterator.isEmpty());
    }
}
