package com.company;

public class Cell implements IntList {

    private int data;
    private Cell nextCell;

    public Cell(int data, Cell nextCell){
        this.data = data;
        this.nextCell = nextCell;
    }

    public int getData() {
        return data;
    }

    public Cell getNextCell() {
        return nextCell;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }

    @Override
    public boolean isEmpty() {
        return nextCell == null;
    }

    public IntList getTail(){
        if(nextCell==null){
            return this;
        }
        return nextCell.getTail();
    }

    @Override
    public IntList cons(int n) {
        if(nextCell==null){
            nextCell = new Cell(n,null);
            return nextCell;
        }
        return nextCell.cons(n);
    }
    @Override
    public int length() {
        return 1+nextCell.length();
    }

    @Override
    public void addInt(int n) {
        data += n;
        if(!isEmpty()) nextCell.addInt(n);
    }

    @Override
    public IntList concat(IntList list) {
        return null;
    }
}
