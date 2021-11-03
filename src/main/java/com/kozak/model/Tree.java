package com.kozak.model;

import com.kozak.enums.Types;
import com.kozak.interfaces.Plant;

import java.util.ArrayList;
import java.util.List;

public abstract class Tree implements Plant {
    private Types type;

    private boolean isAlive;

    private int height;
    private Trunk trunk;

    private List<Branch> branches;

    private List<Leaf> leaves;


    protected Tree(Types type) {
        this.type = type;

        this.isAlive = true;

        this.trunk = new Trunk();

        this.branches = new ArrayList<>();
        this.branches.add(new Branch());

        this.leaves = new ArrayList<>();
        this.leaves.add(new Leaf());

    }

    @Override
    public void grow() {
        this.height++;

        this.trunk.grow();
        for (Branch branch : this.branches) {
            branch.grow();
        }
        for (Leaf leaf : this.leaves) {
            leaf.grow();
        }
        this.branches.add(new Branch());
        this.leaves.add(new Leaf());
    }

    @Override
    public void die() {
        this.isAlive = false;
        this.height = 0;
        this.branches = null;
        this.leaves = null;
        this.trunk = null;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void winterIsComing() {
        if (this.type == Types.CONIFER) {
            this.leaves = new ArrayList<>();
        }
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}