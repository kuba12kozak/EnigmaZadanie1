package com.kozak.model;


import com.kozak.enums.Types;

public class Deciduous extends Tree {
    public Deciduous() {
        super(Types.DECIDUOUS);
        this.setHeight(30);
    }
}
