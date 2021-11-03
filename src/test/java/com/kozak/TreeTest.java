package com.kozak;

import com.kozak.enums.Types;
import com.kozak.model.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void testCreatingNewDeciduousTree() {
        Deciduous deciduous = new Deciduous();
        assertEquals(deciduous.getType(), Types.DECIDUOUS);
        assertTrue(deciduous.isAlive());
        assertEquals(deciduous.getHeight(), 30);
        testCommonFields(deciduous);
    }

    @Test
    void testCreatingNewConiferTree() {
        Conifer conifer = new Conifer();
        assertEquals(conifer.getType(), Types.CONIFER);
        assertTrue(conifer.isAlive());
        assertEquals(conifer.getHeight(), 40);
        testCommonFields(conifer);
    }

    @Test
    void testGrowMethod() {
        Deciduous deciduous = new Deciduous();
        Trunk trunk = deciduous.getTrunk();
        Branch initialBranch = deciduous.getBranches().get(0);
        Leaf initialLeaf = deciduous.getLeaves().get(0);
        deciduous.grow();

        assertTrue(deciduous.isAlive());
        assertEquals(deciduous.getHeight(), 31);
        assertEquals(deciduous.getBranches().size(), 2);
        assertEquals(deciduous.getLeaves().size(), 2);
        assertEquals(trunk.getDimension(), 11);
        assertEquals(initialBranch.getLength(), 2);
        assertEquals(initialLeaf.getSize(), 2);
    }

    private void testCommonFields(Tree tree) {
        assertEquals(tree.getBranches().size(), 1);
        assertEquals(tree.getLeaves().size(), 1);
        assertEquals(tree.getTrunk().getDimension(), 10);
    }


}