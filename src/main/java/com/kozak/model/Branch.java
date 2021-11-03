package com.kozak.model;

public class Branch {
    private int length;

    public Branch() {
        this.length = 1;
    }

    public void grow() {
        length++;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
