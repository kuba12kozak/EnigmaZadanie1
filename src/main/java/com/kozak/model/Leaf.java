package com.kozak.model;

public class Leaf {
    int size;

    public Leaf() {
        this.size = 1;
    }

    public void grow() {
        size++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}