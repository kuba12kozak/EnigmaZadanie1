package com.kozak.model;

public class Trunk {
    private int dimension;

    public Trunk() {
        this.dimension = 10;
    }

    public void grow() {
        this.dimension++;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
