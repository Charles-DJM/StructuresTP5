package com.company;

public interface IntList {
    /**@return vrai si la liste es vide faux sinon*/

    boolean isEmpty();

    IntList cons(int n);

    int length();

    String toString();

    void addInt(int n);

    IntList concat(IntList list);

    IntList getTail();
}
